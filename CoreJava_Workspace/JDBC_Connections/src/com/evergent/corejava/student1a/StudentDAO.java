package com.evergent.corejava.student1a;


import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentDAO {
	
	                     
	public int addStudent(StudentBean stbean)
	  {
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  try
		  	{
			  con=StudentDB.getConnection();  		 		  
			  String ins_str ="insert into Student values(?,?,?,?)";
			  pstmt = con.prepareStatement(ins_str);
			  pstmt.setInt(1,stbean.getstudentId());
			  pstmt.setString(2,stbean.getname());
			  pstmt.setInt(3,stbean.getmarks());
			  pstmt.setString(4,stbean.getGrade());
			  int updateCount = pstmt.executeUpdate();
			  con.close();
			  return updateCount;
		  	}
		  catch(Exception ex)
		  {
			  System.out.println(ex.toString());
			  return 0;
		  }  
	  }

	
	  
}

