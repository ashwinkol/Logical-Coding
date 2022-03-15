package com.logical;

//Sum of Digits of 1 to 50 whose sum is 10
public class SumOfNumbersEqualsTo10 {
	public static void main(String[] args) {
		
		int sum =0;
		
		for(int i=1;i<=50;i++){
			for(int j=1;j<=50;j++){
				sum = i + j;
				
				if(sum == 10){
					System.out.println(i+ " + "+j+" = "+sum);
					sum =0;
				}
			}
		}
	}

}
