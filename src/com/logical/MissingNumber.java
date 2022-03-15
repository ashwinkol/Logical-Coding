package com.logical;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = {1,2,3,5,6,7,8,10,11,12,14,17,19};
		
		for (int i = 0; i < a.length-1; i++) {
		
			if(a[i]+1 != a[i+1] ) {
				for (int k = a[i]+1; k < a[i+1]; k++) {
					System.out.print(" "+k);
				}
			}
			
	}

	}
}
