package com.evergent.corejava.oops;
//encapsulation example
public class Personencapsulation {
	int age=23;
	String name="abc";
	String address="hyd";
	public void display() {
		System.out.println("person age:"+age);
		System.out.println("person name:"+name);
		System.out.println("person address:"+address);
	}
	

	public static void main(String[] args) {
		Personencapsulation p=new Personencapsulation();
		p.display();
		
		
	}

}
