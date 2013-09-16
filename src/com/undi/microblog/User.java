package com.undi.microblog;

import java.util.ArrayList;
import java.util.List;

public class User {
	private int userId;
	private String username;
	private String email;
	private String passwordHash;
	private List<Permission> perms;
	
	public static enum Permission { READ_ENTRY, CREATE_ENTRY, USER_ADMIN };
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public List<Permission> getPerms() {
		if(perms == null){
			perms = new ArrayList<>();
		}
		return perms;
	}
	public void setPerms(List<Permission> perms) {
		this.perms = perms;
	}
}
