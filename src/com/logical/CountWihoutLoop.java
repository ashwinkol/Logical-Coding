package com.logical;

import java.util.*;

public class CountWihoutLoop {
	public static void main(String[] args) {

		
		Integer[] a = {1,2,4,5,3,2,3,3,1,4,5,6,7,7,9,1};
		
		System.out.println("Select To Find Occurence Of Number: ");
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		
		List<Integer> b = Arrays.asList(a);
		
		int frq = Collections.frequency(b, in);
		
		System.out.println(in+" Occred "+frq+" Times in the loop");
	}

}
