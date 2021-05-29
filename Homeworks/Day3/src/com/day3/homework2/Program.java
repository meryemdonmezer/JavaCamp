package com.day3.homework2;

import com.day3.homework2.entities.Instructor;
import com.day3.homework2.entities.Student;
public class Program {

	public static void main(String[] args) {
		
		// homework 2

		Instructor engin = new Instructor(1, "Engin", "Demiroğ", "engin@mail.com");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(engin);

		Student meryem = new Student(1, "Meryem", "Donmezer", "meryem@mail.com");
		StudentManager studentManager = new StudentManager();
		studentManager.add(meryem);
		
		
		
	}

}