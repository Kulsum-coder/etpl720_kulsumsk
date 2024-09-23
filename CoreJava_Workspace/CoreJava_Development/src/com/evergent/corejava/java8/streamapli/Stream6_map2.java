package com.evergent.corejava.java8.streamapli;

import java.util.Arrays;
import java.util.List;

public class Stream6_map2 {

	public static void main(String[] args) {
		        
		List<String> listInt=Arrays.asList("Hello","Stream","API");
		
				
		listInt.stream().map(str->str.length()).forEach(System.out::println);

	} 
}
