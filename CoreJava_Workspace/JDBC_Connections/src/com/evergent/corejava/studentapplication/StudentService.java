package com.evergent.corejava.studentapplication;


import com.evergent.corejava.LayerWise.Bookapplication.BookBean;
import com.evergent.corejava.LayerWise.Bookapplication.BookDAO;

public class StudentService {
	                           //100      corejava    250
	public int addStudentService(int studentId,String studentname,String address)
	{  String grade="";
	
	   if(address=="hyderabad")
	   {
		   grade = "local";
	   }
	   else
	   {
		   grade = "not local";
		   
	   }
	  
		
		
		StudentDAO studentDAO = new StudentDAO();
		StudentBean stBean=new StudentBean();
	       stBean.setstudentId(studentId);	
	       stBean.setname(studentname);
	       stBean.setaddress(address);
	       stBean.setGrade(grade);
	
		   int updateResult= studentDAO.addStudent(stBean);
		
		return 1;
	} 
}

