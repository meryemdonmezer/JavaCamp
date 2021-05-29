package com.day2.homework1;

public class Program {

	public static void main(String[] args) {
		
		Course[] courses = new Course[]{
				new Course(1, "java beginner course", true),
				new Course(1, "c# beginner course", true),
				new Course(1, "php beginner course", true),
				new Course(1, "go beginner course", false),
				new Course(1, "c++ beginner course", false),
		};
		CourseManager manager= new CourseManager();
		manager.complatedCourses(courses);
		
		manager.uncomplatedCourses(courses);
	}
}
