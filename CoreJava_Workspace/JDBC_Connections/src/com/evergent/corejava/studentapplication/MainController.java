package com.evergent.corejava.studentapplication;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int studentId=0;
		String name="";
		String address="";
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter student ID");
		studentId=sin.nextInt();
		System.out.println(("Enter student name"));
		name = sin.next();
		System.out.println("Enter address");
		address = sin.next();
		
		StudentService studentService = new StudentService();
		
		int updeateCount=studentService.addStudentService(25, "abc", "ongole");
		
		
		//last
		  System.out.println("Inserted :"+updeateCount+" record kulsum Success");
		
		
		
		
	}

}
