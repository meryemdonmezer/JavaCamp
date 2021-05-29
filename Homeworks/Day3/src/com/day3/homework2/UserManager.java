package com.day3.homework2;

import com.day3.homework2.entities.User;

public class UserManager {

	
	public void add(User user) {
		System.out.println("User added" + "id: " + user.getId() + "first name:" + user.getFirstName() + "last name" + user.getLastName() + "email: "+ user.getEmail());
	}
	
	public void update(User user) {
		System.out.println("User updated" + "id: " + user.getId() + "first name:" + user.getFirstName() + "last name" + user.getLastName() + "email: "+ user.getEmail());	
	}
	public void delete(User user) {
		System.out.println("User deleted" + "id: " + user.getId() + "first name:" + user.getFirstName() + "last name" + user.getLastName() + "email: "+ user.getEmail());
	}
	public void get()
	{
		System.out.println("User fetched");
	}
}
//get 
// set