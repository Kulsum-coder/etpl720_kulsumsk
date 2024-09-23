package com.evergent.corejava.oops;
class mydata{
	public void display() {
		System.out.println("Display local");
	}
}


public class Polymorphismoverriding extends mydata {
	public void display() {
		System.out.println("Dispaly main class");
	}

	public static void main(String[] args) {
		Polymorphismoverriding po=new Polymorphismoverriding();
		po.display();
		mydata pi=new mydata();
		pi.display();
		
	}

}
