package com.evergent.corejava.static1;

public class StaticDemo2 {
	static String cname="india";
	static public void mydata() {
		System.out.println("mydata");
	}
	

	public static void main(String[] args) {
		//classname.method name and classname.variable name
		System.out.println(StaticDemo2.cname);
		StaticDemo2.mydata();

	}

}
