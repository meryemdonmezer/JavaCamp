package com.day2.homework1;

public class CourseManager {
	
	public CourseManager() {
		
	}
	public void complatedCourses(Course[] courses) {
		for(Course item : courses) {
			if(item.progress == true){
				System.out.println("Complated coures: " +item.title);
			}
		}
	}
	public void uncomplatedCourses(Course[] courses) {
		for(Course item : courses) {
			if(item.progress == false) {
				System.out.println("Uncomplated course: " + item.title);
			}
		}
	}
}
