package com.logical;

public class SplitString {
	public static void main(String[] args) {
		int count = 0;
		String a = " India Is Country I Love India ";
		
		  for (int i = 0; i < a.length(); i++) {
		  
		  if (a.charAt(i) == ' ') { count += 1; }
		  
		  } String[] x = a.split(" ", count);
		  
		  for (String b : x) { System.out.println(b); }
		 
	}

}
