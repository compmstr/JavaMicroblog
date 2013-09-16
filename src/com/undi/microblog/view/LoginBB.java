package com.undi.microblog.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.undi.microblog.CommandResponse;
import com.undi.microblog.CommandResponse.Status;
import com.undi.microblog.UserSession;

@RequestScoped
public class LoginBB {
	@Inject
	UserSession session;
	
	private String username;
	private String password;
	private String loginMessage = "";
	
	public void login(){
		CommandResponse res = session.login(getUsername(), getPassword());
		if(res.status == Status.SUCCESS){
			setLoginMessage(res.message);
		}else{
			setLoginMessage("Error logging in: " + res.message);
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private void setLoginMessage(String msg){
		this.loginMessage = msg;
	}
	public String getLoginMessage(){ return this.loginMessage; }
}
