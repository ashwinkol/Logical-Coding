	package com.logical;


public class FizzBuzzBest {
	public static void main(String[] args) {
		
		int fizz = 0;
		int buzz = 0;
		
		String ans =  "";
		
		
		for (int i = 1; i < 101; i++) {
			
			fizz++;
			buzz++;
			
			if(fizz == 3 ) {
				ans+="fizz";
				fizz = 0;
			}
			
			if(buzz == 5 ) {
				ans+="buzz";
				buzz = 0;
			}
			
			if(ans == "") {
				System.out.println(i);
			}
			
			else {
				System.out.println(ans);
				ans = "";
			}
			
		}
		
		
	}

}


