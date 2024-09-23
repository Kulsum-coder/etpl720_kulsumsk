
package com.evergent.corejava.Jdbc.BookApplication;
import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		int bookId=0;
		String title="";
		float price=0;
		
		Scanner sin=new Scanner(System.in);
		
		System.out.println("Enter Book ID :");
		bookId=sin.nextInt();
		System.out.println(("Enter Book Title :"));
		title = sin.next();
		System.out.println("Enter Book Price : ");
		price = sin.nextFloat();
		
		BookService bookService = new BookService();
		                                         // 100     java  250
		int updeateCount=bookService.addBookService(12, "ghj", 250);
		
		
		//last
		  System.out.println("Inserted : "+updeateCount+" record ram Success");
		
		
		
		
	}

}
