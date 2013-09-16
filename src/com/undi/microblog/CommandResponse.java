package com.undi.microblog;

public class CommandResponse {
	public static enum Status { SUCCESS, FAILURE, ERROR, INFO };
	
	public final Status status;
	public final String message;
	
	public CommandResponse(Status status, String msg){
		this.status = status;
		this.message = msg;
	}
}
