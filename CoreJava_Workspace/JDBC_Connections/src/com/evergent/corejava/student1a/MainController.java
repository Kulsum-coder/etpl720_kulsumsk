package com.evergent.corejava.student1a;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentId=0;
		String name="";
		int marks=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter student ID");
		studentId=sin.nextInt();
		System.out.println(("Enter student name"));
		name = sin.next();
		System.out.println("Enter address");
		marks = sin.nextInt();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(studentId, name, marks);
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record kulsum Success");
		
		
		
		
	}

}
