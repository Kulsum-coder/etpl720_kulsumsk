package com.evergent.corejava.java8.streamapli;


import java.util.Arrays;
import java.util.List;

public class StreamApi1_Demo {

	public static void main(String[] args) {
		
		  List<Integer> listInt = Arrays.asList(1,2,3,4,5,6);
		   
				  for(int i=0;i<6;i++)
				   System.out.println(listInt.get(i));
				  
				  
				  //Stream API with Method reference ::				  
				listInt.stream().forEach(System.out::println);	 

	} }