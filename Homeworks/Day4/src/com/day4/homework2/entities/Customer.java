package com.day4.homework2.entities;

public class Customer implements Entity {
	int id;
	String firstName;
	String lastName;
	String citizenNo;
	int birthYear;
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, String citizenNo, int birthYear) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.citizenNo = citizenNo;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCitizenNo() {
		return citizenNo;
	}
	public void setCitizenNo(String email) {
		this.citizenNo = citizenNo;
	}
}
