package com.day3.homework2.entities;

public class Instructor extends User {
	
	public Instructor() {
		
	}
	public Instructor(int id, String firstName, String lastName, String email) {
		this.id =id;
		this.firstName = firstName;
		this.lastName =lastName;
		this.email = email;
	}
}
