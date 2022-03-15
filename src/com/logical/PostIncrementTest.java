package com.logical;

public class PostIncrementTest {
	public static void main(String[] args) {
		
		int x = 201;
		System.out.println("This is x "+x);
		myMethod(x++);
		System.out.println(x);
	}
		
		public static void myMethod(int a){
			System.out.println("x in static is: "+(a%=10));
			a %=10;
		System.out.println(a);
	}

}
