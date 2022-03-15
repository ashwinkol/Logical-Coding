package com.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class SplitYearFromString {

	public static void main(String[] args) {

		String in = "india got independance in 15-08-1947 and world war in happen in 02-05-1945";
		
		Vector<String> v = new Vector<String>();
		Vector<Integer> years = new Vector<Integer>();
		Vector<String> ans = new Vector<String>();
		
		String[] x = in.split(" ");
		
		
		for (int i = 0; i < x.length; i++) {
			
			if(x[i].contains("-")){
				v.add(x[i]);
			}
					
		}
		
		for(String y : v) {
			String[] a = y.split("-");
			ans.add(a[a.length - 1]);
		}
		
		Set<Integer> theSet = new HashSet<Integer>();
		
		for(String one : ans) {
			Integer s = Integer.parseInt(one);
			int j  = s;
			theSet.add(j);
		}
		
		
		System.out.println("The Set"+theSet+" Size: "+theSet.size());
		
		
		
		
		/*
		 * String[] c = in.split(" ");
		 * 
		 * Vector<String> x = new Vector<String>(); Vector<Integer> o = new
		 * Vector<Integer>(); Set<Integer> ans = new HashSet<Integer>(); for(String a :
		 * c) {
		 * 
		 * if(a.contains("-")) { x.add(a); } }
		 * 
		 * for(String b : x) { String[] q = b.split("-"); ans.add(
		 * Integer.valueOf(q[q.length - 1])); }
		 * 
		 * System.out.println("Ans "+ans+" "+ans.size());
		 */
		
	}

}
