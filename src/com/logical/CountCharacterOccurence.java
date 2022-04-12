package com.logical;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		String s = "i love my india";
		char a = 'i';
		int b = s.length() - s.replace("i","").length();
		
		System.out.println("the character "+a+"  Occured "+b+" times");
	}

}
