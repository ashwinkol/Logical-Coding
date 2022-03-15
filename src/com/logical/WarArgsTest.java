package com.logical;

import java.util.Arrays;



public class WarArgsTest {
	public static void main(String[] args) {
		
		TheTest(new int[]{10,20,40});
	}
	static int TheTest(int[]... a){
		System.out.println(Arrays.toString(a));
		return 0;
	}

}
