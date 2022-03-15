package com.logical;

import java.util.HashSet;

public class CommonIntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,4,5,6,4,3,2};
		int b[] = {1,3,2,4,6,4,5,1};
		
		HashSet<Integer> c = new HashSet<>();
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if(a[i] == b[j]) {
					c.add(a[i]);
				}
			}
			
		}
		
		System.out.println(c);
	}
	

}
