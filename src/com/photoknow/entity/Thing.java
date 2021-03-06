package com.photoknow.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="thing")
@NamedQueries({
	@NamedQuery(name="Thing.getThingByUserId",
			query="select i from Thing i where i.userId = :userId")
})
public class Thing implements Serializable {
	@Id
    private String id;
	@Column(length=100)
	private String title;
	@Column(length=1000)
	private String description;
	@Column(length=1000)
	private String saidSomething;
	@Column(length=40)
	private String status;
	@Column(length=40)
	private String beginDate;
	@Column(length=40)
	private String beginTime;
	@Column(length=40)
	private String endTime;
	private boolean isPrompting;
	private String classessId;
	@Column(length=40)
	private String thingQuadrant;
	@Column
	private String planId;
	@Column
	private String roleId;
	@Column
	private String userId;
	@Column(length=40)
	private String progress;
	@Column(length=40)
	private String createBy;
	@Column(length=40)
	private String createAt;
	@Column(length=40)
	private String updateBy;
	@Column(length=40)
	private String updateAt;
	@Column(length=40)
	private String type;
	@Column(length=40)
	private String period;
	@Column(length=40)
	private String whatDay;
	@Column(length=40)
	private Integer holdOnDay;
	@Column(length=40)
	private String habitStatus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSaidSomething() {
		return saidSomething;
	}
	public void setSaidSomething(String saidSomething) {
		this.saidSomething = saidSomething;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public boolean isPrompting() {
		return isPrompting;
	}
	public void setPrompting(boolean isPrompting) {
		this.isPrompting = isPrompting;
	}
	
	public String getClassessId() {
		return classessId;
	}
	public void setClassessId(String classessId) {
		this.classessId = classessId;
	}
	public String getThingQuadrant() {
		return thingQuadrant;
	}
	public void setThingQuadrant(String thingQuadrant) {
		this.thingQuadrant = thingQuadrant;
	}
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getWhatDay() {
		return whatDay;
	}
	public void setWhatDay(String whatDay) {
		this.whatDay = whatDay;
	}
	public Integer getHoldOnDay() {
		return holdOnDay;
	}
	public void setHoldOnDay(Integer holdOnDay) {
		this.holdOnDay = holdOnDay;
	}
	public String getHabitStatus() {
		return habitStatus;
	}
	public void setHabitStatus(String habitStatus) {
		this.habitStatus = habitStatus;
	}
	

}
