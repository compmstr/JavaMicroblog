package com.undi.microblog;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;

@ApplicationScoped
public class UserMgr {
	private List<User> users;

	@PostConstruct
	public void init(){
		getUsers().add(new User());
	}
	
	public List<User> getUsers() {
		if(users == null){
			users = new ArrayList<>();
		}
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
