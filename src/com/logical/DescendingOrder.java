package com.logical;

public class DescendingOrder {
	public static void main(String[] args) {
		int a[] = {8,4,2,2,0,9,3,1,3,1,6,9,4,3,8,0};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] < a[j]){
					int temp = a[i];
					a[i] =a[j];
					a[j] =temp;
				
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		
	}
}
