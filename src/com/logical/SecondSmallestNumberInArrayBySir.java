package com.logical;

public class SecondSmallestNumberInArrayBySir {
public static void main(String[] args) {
		
		int[] a = {12,3,4,2,4,56,788};

		for(int i=0;i<2;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] =a[j];
					a[j] =temp;
					
				}
			}
		}
		
		System.out.println("Second Smallest element is: "+a[2-1]);
		
//		int small=a[1], secondSmallest=0, max=a[0];
//		
//		
//		for(int i=0;i<a.length;i++){
//			if(a[i]<small){
//				small=a[i];
//			}
//		}
//		
//		for(int i=0;i<a.length;i++){
//			if(a[i]>max){
//				max=a[i];
//			}
//		}
//		
//		int temp = small;
//		int max1 =max;
//		
//        for(int i=small;i<=max;i++){		
//        	temp +=1;
//        	
//        	for(int j=0;j<a.length;j++){
//        		
//        		if(a[j]==temp){
//        			secondSmallest =temp;
//        			System.out.println("Second Smallest: "+secondSmallest);
//        			break;
//        			}
//        	}
//        }
//		
//
}  
}
