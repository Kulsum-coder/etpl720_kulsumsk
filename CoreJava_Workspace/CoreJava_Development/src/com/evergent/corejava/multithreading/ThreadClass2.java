package com.evergent.corejava.multithreading;

public class ThreadClass2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			
		}
		
	}
	public static void main(String[] args) {
		ThreadClass2 obj1=new ThreadClass2();
		Thread t2=new Thread(obj1);
		t2.start();
	}

}
