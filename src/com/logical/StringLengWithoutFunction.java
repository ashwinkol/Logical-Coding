package com.logical;

public class StringLengWithoutFunction {
	
	

	public static void main(String[] args) {
		int count = 0;
		int i = 0;

		try {
			String in = "I Love India!";
			
			while( i > -1 ) {
				char ch = in.charAt(i);
				int num = ch;
				if(num > 48) {
					count+=1;
					
				}
				i++;
			}
			
		}
		
		catch(Exception e ) {
			
			System.out.println("Count: "+count);
		}

		
		
		
		
	}

}
