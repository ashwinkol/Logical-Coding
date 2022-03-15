package com.logical;

import java.util.*;
//Remove Duplicates from array Without using Loop
public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		Integer[] a = {1,1,2,2,1,2,4,5,3,3,4,6,7,3,3,3};
		List<Integer> b = Arrays.asList(a);
		Set<Integer> c = new LinkedHashSet<Integer>();
		c.addAll(b);
		
		System.out.println(c);
	}

}
