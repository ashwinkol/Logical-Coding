package com.logical;

public class IsInputNumbers {

	public static boolean isNumber(String in) {
		
		
		for (int i = 0; i < in.length(); i++) {
			int a = in.charAt(i);
			if(a > 47 && a < 58) {
				continue;
			}
			else {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {

		boolean b = isNumber("0123456789");
		
		if(b) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
