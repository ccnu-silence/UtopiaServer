package com.photoknow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_sync_record")
@NamedQueries({
	@NamedQuery(name="UserSyncRecord.getRecord",
			query="select u from UserSyncRecord u where u.userId = :userId and u.deviceId = :deviceId and u.syncDate = :syncDate"),
	@NamedQuery(name="UserSyncRecord.findRecord",
			query="select u from UserSyncRecord u where u.userId = :userId")
})
public class UserSyncRecord {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String userId;
	@Column(length=100)
	private String deviceId;
	@Column(length=40)
	private String syncDate;
	
	public UserSyncRecord() {}
	
	public UserSyncRecord(String userId, String deviceId, String syncDate) {
		this.userId = userId;
		this.deviceId = deviceId;
		this.syncDate = syncDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getSyncDate() {
		return syncDate;
	}
	public void setSyncDate(String syncDate) {
		this.syncDate = syncDate;
	}
}
