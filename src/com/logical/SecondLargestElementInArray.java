package com.logical;

public class SecondLargestElementInArray {
public static void main(String[] args) {
		
		int[] a = {0,23,45,65,32,13,102,111,12,1234,432};
		  
		int max=a[3];
        		
		for(int i=0;i<a.length;i++){
			if(max < a[i]){
				max=a[i];
			}
		}
		int temp =max;
		int secondLarge =0;
		System.out.println("Largest Element is: "+max);
		
		for(int i=max;i>=0;i--){
			temp-=1;
			for(int j=0;j<a.length;j++){
				
				if(a[j]==temp){
					secondLarge =temp;
					System.out.println("Second Lagest Element is: "+secondLarge);
					temp=0;
                    break;
					}
			}
         }
			
		}

}
