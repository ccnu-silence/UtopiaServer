package com.photoknow.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.photoknow.entity.Idea;
import com.photoknow.entity.Plan;
import com.photoknow.entity.Role;
import com.photoknow.entity.Thing;
import com.photoknow.entity.ThingClasses;
import com.photoknow.entity.User;
import com.photoknow.entity.UserData;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@PersistenceContext(unitName = "utopia")
	protected EntityManager em;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub	
		try{ 
			/*return (User)em.createNamedQuery("User.login").setParameter("number", "")
					.setParameter("password", user.getPassword()).getSingleResult(); */
		
			return null;
		}catch(NoResultException ex){ 
			return null; 
		}
	}

	@Override
	public void saveUserData(UserData userData) throws Exception {
		try{ 
			List<User> userList = (List<User>)em.createNamedQuery("User.getUserByEmail").setParameter("email", userData.getUser().getEmail()).getResultList();
			if(userList != null && userList.size() != 0) {
				User user = userList.get(0);
				em.createNativeQuery("delete from user where userId = "+user.getUserId()+"").executeUpdate();
				em.createNativeQuery("delete from idea where userId = "+user.getUserId()+"").executeUpdate();
				em.createNativeQuery("delete from thing_class where userId = "+user.getUserId()+"").executeUpdate();
				em.createNativeQuery("delete from thing where userId = "+user.getUserId()+"").executeUpdate();
				em.createNativeQuery("delete from role where userId = "+user.getUserId()+"").executeUpdate();
				em.createNativeQuery("delete from plan where userId = "+user.getUserId()+"").executeUpdate();
				
			}
			
			User nUser = userData.getUser();
			nUser.setUserId(null);
			em.persist(nUser);
			
			
			for(Idea idea : userData.getIdeaList()) {
				idea.setId(null);
				idea.setUserId(nUser.getUserId());
				em.persist(idea);
			}
			
			for(ThingClasses classes : userData.getClassesList()) {
				classes.setId(null);
				classes.setUserId(nUser.getUserId());
				em.persist(classes);
			}
			
			for(Thing thing : userData.getThingList()) {
				thing.setId(null);
				thing.setUserId(nUser.getUserId());
				em.persist(thing);
			}
			
			for(Role role : userData.getRoleList()) {
				role.setId(null);
				role.setUserId(nUser.getUserId());
				em.persist(role);
			}
			
			for(Plan plan : userData.getPlanList()) {
				plan.setId(null);
				plan.setUserId(nUser.getUserId());
				em.persist(plan);
			}
		}catch(Exception ex){ 
			ex.printStackTrace();
			throw ex;
		}
	}	
	
}