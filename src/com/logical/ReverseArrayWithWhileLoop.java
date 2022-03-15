package com.logical;

import java.util.Arrays;

public class ReverseArrayWithWhileLoop {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8};
		
		int i= 0;
		int j = a.length - 1;
		while(i < j) {
			
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
