package com.logical;

public class LinearSearchSorted {
	public static void main(String[] args) {
		
		int[] a ={1,2,4,3,5,8,22,45,6,7,1,1,1,3,3,};
		int n=3,count=0; //You have to find number that User input!
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]==n){
				count+=1;
			}
		}
		System.out.println("Number "+n+" found "+count+ " Times in Array");
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					a[j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					}
			}

		}
		
		System.out.println("Sorted Number Is: ");
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
			System.out.print(a[i]+",");
			}
		}
	}

}
