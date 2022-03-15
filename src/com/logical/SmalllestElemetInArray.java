package com.logical;

public class SmalllestElemetInArray {
	public static void main(String[] args) {
		int[] a={1,1,3,4,2,5,6,7};
		int small=a[0];

        for(int i=0;i<a.length;i++){

			if(a[i] <  small){
				small=a[i];
			}

        }  
		
		System.out.println("Smallest Value In Array Is: "+small);
	} 
	
}
