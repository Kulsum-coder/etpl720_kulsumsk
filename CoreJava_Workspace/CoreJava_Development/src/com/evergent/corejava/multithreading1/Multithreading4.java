package com.evergent.corejava.multithreading1;

public class Multithreading4 {

	public static void main(String[] args) {
		Employee t1=new Employee();
		t1.start();  
		
		System.out.println(Thread.activeCount()); // 2 two Threads 1 main 2 t1.start
        
	}}

class Employee extends Thread{
	//run is method of thread class
	public void run() {
		System.out.println("Welcome ");
	}
}
