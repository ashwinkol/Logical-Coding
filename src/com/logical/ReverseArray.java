package com.logical;
import java.util.*;
public class ReverseArray {
	
	public static void reverse(Integer a[]) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) {
		Integer[] arr = {10,20,30,40,50};
		
		reverse(arr);
		
	}

}
