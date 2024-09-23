package com.evergent.corejava.static1;
//without creating object in main method
public class StaticDemo1 {
	//static variable
	static String cname="india";
	//static method
	static public void mydata() {
		System.out.println("mydata");
	}

	public static void main(String[] args) {
		System.out.println(cname);
		mydata();
		
		
	}

}
