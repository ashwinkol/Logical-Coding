package com.logical;

public class LargestNumber {
	public static void main(String[] args) {
		int max=0;
		int[] x = {20394,209324,1,2,34,23,65,23,45};
		
		for(int i=0;i<x.length;i++){
			if(x[i] > max){
				max = x[i];
			}
		}
		System.out.println("Largest element is: "+max);
		
	}

}
