package com.persistent.semicolon.userservice.model;

import java.io.Serializable;
import java.util.ArrayList;



public class UserList implements Serializable{

	private ArrayList<User> uList;

	public UserList()
	{
		uList = new ArrayList<User>();
	}

		
	public UserList(ArrayList<User> uList) {
		super();
		this.uList = uList;
	}



	public ArrayList<User> getuList() {
		return uList;
	}

	public void setuList(ArrayList<User> uList) {
		this.uList=uList;
	}


	@Override
	public String toString() {
		return "UserList [uList=" + uList + "]";
	}
	
   
	
	
}
