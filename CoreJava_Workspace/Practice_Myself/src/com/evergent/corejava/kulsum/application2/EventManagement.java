package com.evergent.corejava.kulsum.application2;


import java.io.IOException;
import java.util.Scanner;

public class EventManagement {

	enum module1 {O,P,R,E};
	enum submodule1 {F,S,M};
	enum submodule2  {T,P,M};
	enum submodule3  {I,S,M};
	enum menucode  {A,B};
	static int menuitemcost;
	static int amount;
	static int guest;
	static int amountdisc;
	static int additionalitemcost;
	public static void main(String[] args) throws IOException {
		  String module = null;
		
		  Scanner br =new Scanner(System.in);
	    
	    System.out.println("\n\t\t \t\t Welcome To EVENT MANAGEMENT SYSTEM");
	    
		while(true)
		{
	
	  
		System.out.println("======================");
		System.out.println(" EMS Main Menu");
		System.out.println("======================");
		System.out.println("O-Order Module");
		System.out.println("P-Payment Module");
		System.out.println("R-Report Module");
		System.out.println("E-Quit Module");
		System.out.println("======================");
	    System.out.println("Enter your Module code (O,P,R,E) : ");


module=br.nextLine();
System.out.println("You entered module is  : " );  
		}
	}
}


