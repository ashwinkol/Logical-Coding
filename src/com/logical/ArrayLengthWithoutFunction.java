package com.logical;

public class ArrayLengthWithoutFunction {

	public static void main(String[] args) {

		int count = 0;
		int[] a = {1,2,3,4,5,6,7,8,9};
		int i = 0;
		try {
			
			while( i > -1 ) {
				
				int x = a[i];
				count+=1;
				i++;
			}
			
		}
		catch (Exception e) {
			
			System.out.println("Length of the Array: "+count);
		}
	}

}
