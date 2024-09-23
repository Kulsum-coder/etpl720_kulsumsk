package com.evergent.java8.lambda;

interface Names
{
	  String myName(String names);
}

public class Lamda9 {

	public static void main(String[] args) {
		 Names n1 =(names)->{
			 
			 String str1="CoreJava :";
			 String str2= str1 +names;
			 return str2;
		 };
   System.out.println(n1.myName("JAVA8"));
	}

}