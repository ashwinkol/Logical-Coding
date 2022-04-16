package com.logical;

public class BikeNumberAddition {

	public static void main(String[] args) {
		
		
		String number = "mh29 aa 5075";
		
		int sum = 0;
		
		for (int i = 0; i < number.length(); i++) {
			
			char ch = number.charAt(i);
						
			int num = (int)ch - 48;
			
			if(num > -1 && num < 10) {
				sum+=num;
			}
			
			
		}
		
		System.out.println("Sum is: "+sum);
	}
}
