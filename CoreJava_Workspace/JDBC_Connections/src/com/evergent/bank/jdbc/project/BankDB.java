package com.evergent.bank.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class BankDB {
		
		  public static Connection getConnection()
		  throws Exception
		  {
			  //loadimg the driver 
			 Class.forName("com.mysql.jdbc.Driver");
			  Connection  conn = DriverManager.getConnection(
					  "jdbc:mysql://localhost:3306/evergentdb",//Url
					  "root",//username
					  "root"); //password
			  
			  
			//for oracle
			/*  String driverName = "oracle.jdbc.driver.OracleDriver";
			  Class.forName(driverName);
			  Connection conn = DriverManager.getConnection(
			              "jdbc:oracle:thin:@localhost:1521:XE","capgmulesoft","capgmulesoft");
			*/
			return conn;
		  }

		}