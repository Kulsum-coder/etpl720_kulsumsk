package com.evergent.corejava.multithreading;

public class ThreadClass1 extends Thread{
	public void run() {
		System.out.println("hii");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadClass1 t1= new ThreadClass1();
		
		t1.run();
		t1.run();
		t1.start();
		
	}

}
