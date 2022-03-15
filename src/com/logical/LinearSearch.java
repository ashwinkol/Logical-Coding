package com.logical;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] a ={1,2,5,2,6,7,8,43,2,2,2};
		int n =33,count=0;
		
		for(int i=0;i<a.length;i++){
			if(a[i]==n){
				count+=1;
				
			}
		}
		if(count==0){
			System.out.println("Sorry the given input Number not found!");
		}
		else{
		System.out.println("Number: "+n+ " Found "+count+" Times");
		}
	}

}
