package com.evergent.corejava.java8.streamapli;

import java.util.Arrays;
import java.util.List;

public class StreamApi2_Distinct {

	public static void main(String[] args) {
		         // 11  33 44 5 66
		List<Integer> listInt=Arrays.asList(11,33,44,5,66,44,5); 
		System.out.println(listInt);
		
				//11 33 44 5 66
		listInt.stream().distinct().forEach(System.out::println);

		System.out.println(listInt);
	} 
}
