package com.evergent.corejava.java8.streamapli;

import java.util.Arrays;
import java.util.List;

public class StreamApi3_Limit {

	public static void main(String[] args) {
		        
		List<Integer> listInt=Arrays.asList(11,33,44,5,66,44,5);
		
				
		listInt.stream().limit(4).forEach(System.out::println);

	} 
}