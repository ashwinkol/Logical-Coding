package com.logical;

public class PrimeNumbers {
	public static void main(String[] args) {
	
		//Prime Numbers
		for(int i=2;i<=100;i++){
			
			for(int j=2;j<=i;j++){
				
				if(i==j){
					System.out.println(i);
				}
				
				if(i%j==0){
					break;
				}
					
			}
			
		}
	}

}
