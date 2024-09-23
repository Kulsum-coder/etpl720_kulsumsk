package com.evergent.corejava.student1a;



public class StudentService {
	public int addStudentService(int studentId,String studentname,int marks)
	{  
		String grade="";
	
	   if(marks>90)
	   
		   grade = "A";
	   else if(marks>60) {
		   grade ="B";
	   }
	   else if(marks>40) {
		   grade="C";
	   }
	   else {
		   grade="D";
	   }
	  
		
		
		StudentDAO studentDAO = new StudentDAO();
		StudentBean stBean=new StudentBean();
	       stBean.setstudentId(studentId);	
	       stBean.setname(studentname);
	       stBean.setmarks(marks);
	       stBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(stBean);
		
		return updateResult;
	}

}

