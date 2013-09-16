package com.undi.microblog;

import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.mindrot.bcrypt.BCrypt;

import com.undi.microblog.CommandResponse.Status;

@SessionScoped
public class UserSession {
	private User curUser = null;
	@Inject
	private UserMgr userMgr;

	public User getCurUser() {
		return curUser;
	}

	public void setCurUser(User curUser) {
		this.curUser = curUser;
	}
	
	public boolean isLoggedIn(){
		return curUser != null;
	}
	
	public CommandResponse login(String username, String password){
		for(User user : userMgr.getUsers()){
			if(user.getUsername().equals(username)){
				if(BCrypt.checkpw(user.getPasswordHash(), password)){
					curUser = user;
					return new CommandResponse(Status.SUCCESS, "Logged in");
				}else{
					return new CommandResponse(Status.FAILURE, "Password didn't match");
				}
			}
		}
		return new CommandResponse(Status.FAILURE, "User doesn't exist");
	}
}
