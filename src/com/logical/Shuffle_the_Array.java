package com.logical;

import java.util.*;

public class Shuffle_the_Array {
	/* Ans Should be [2, 3, 5, 4, 1, 7]  */
 
	public static void main(String[] args) {
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		
		
		int[] ans = new int[n*2];
		
		for(int i=0;i<n;i++) {
			
			
			ans[i*2] = nums[i];
			ans[i*2+1] = nums[n+i]; 
		}

		System.out.println(Arrays.toString(ans));
	}

}
