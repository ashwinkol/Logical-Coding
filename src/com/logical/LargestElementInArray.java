package com.logical;
public class LargestElementInArray {

	public static void main(String[] args) {
		int[] a ={1,2,5,54,20,26,173,122};    //
		int max=a[0];
			for(int i=0;i<a.length;i++){
			
			       
				if(a[i]>max){
					max=a[i];
				}
		}
		System.out.println("Largest Element In Array: "+max);

	}

}
