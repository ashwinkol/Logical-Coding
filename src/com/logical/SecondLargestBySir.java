package com.logical;

public class SecondLargestBySir {
public static void main(String[] args) {
	int[] b ={1,2,5,2,2,4,7,4};
	
	for(int i=0;i<2;i++){
		for(int j=i+1;j<b.length;j++){
		
			if(b[i] < b[j]){
				int temp =b[i];
				b[i]=b[j];
				b[j]=temp;
				
			}
		
	}
}
	System.out.println("Second Largest Num Is: "+b[0]);

}
}
