package com.day2.homework1;
public class Course{
	int id;
	String title;
	boolean progress;
	public Course() {
		this.id = 0;
		this.title = "";
		this.progress = false;
	}
	public Course(int id, String title, boolean progress) {
		this.id = id;
		this.title = title;
		this.progress = progress;
	}
}