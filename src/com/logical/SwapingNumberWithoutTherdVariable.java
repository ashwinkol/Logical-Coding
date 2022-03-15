package com.logical;

public class SwapingNumberWithoutTherdVariable {
	public static void main(String[] args) {
		
		//Swapping two numbers withuot using thired Variable
		
		
		int x =10;
		int y= 5;
		System.out.println("Before Swap: \n ");
		System.out.println("x = "+x);
		System.out.println("y = "+y+"\n");
		
		
		x = x + y;
		y= x - y;
		x = x - y;
		
		System.out.println("Afer Swap: \n ");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
	}

}
