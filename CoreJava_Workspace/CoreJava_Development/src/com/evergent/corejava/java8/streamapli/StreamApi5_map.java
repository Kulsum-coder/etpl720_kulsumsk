package com.evergent.corejava.java8.streamapli;


import java.util.Arrays;
import java.util.List;

public class StreamApi5_map {

	public static void main(String[] args) {
		        
		List<Integer> listInt=Arrays.asList(1,2,3,4,5,6);
		
				
		listInt.stream().map(i->i*i).forEach(System.out::println);

	} 
}
