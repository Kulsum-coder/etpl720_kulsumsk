package com.evergent.corejava.studentapplication;


import java.util.ArrayList;

public class StudentDAO {
	
	                       //  100  corejava 250   c
	@SuppressWarnings("unchecked")
	public int addStudent(StudentBean stBean)
	{
		try{
			@SuppressWarnings("rawtypes")
			ArrayList studentList=new ArrayList();
			studentList.add(stBean.getstudentId());
			studentList.add(stBean.getname());
			studentList.add(stBean.getaddress());
		    studentList.add(stBean.getGrade());	
			
			System.out.println(studentList);
			
			   System.out.println("student ID :"+stBean.getstudentId());
			System.out.println("student Title :"+stBean.getname());
			System.out.println("address :"+stBean.getaddress());
			System.out.println(" Grade :"+stBean.getGrade());
			
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}

