package com.logical;

public class RemoveDuplicate1 {
public static void main(String[] args) {
	int[] a = {1,2,4,3,2,1,5,6,7,8,5,1,1,1};
	
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				a[j]=0;
			}
		}
	}
	
	for(int i=0;i<a.length;i++){
		if(a[i]!=0){
			System.out.print(a[i]+",");
		}
	}
	
	
}
}
