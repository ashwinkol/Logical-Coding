package com.logical;

import java.util.Arrays;

public class SortinTest {
	public static void main(String[] args) {

		int[] a = {1,4,3,1,7,3,2,6,8,9,5};
		
	   for (int i = 0; i < a.length; i++) {
		
		   for (int j = i+1; j < a.length; j++) {
			   
			   if(a[i]>a[j]) {
				   
				   int tmp = a[j];
				   a[j] = a[i];
				   a[i] = tmp;
			   }
			
		}
	}
	   System.out.println(Arrays.toString(a));
	}
}
