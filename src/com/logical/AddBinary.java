package com.logical;

public class AddBinary {
	public static void main(String[] args) {
		StringBuffer one = new StringBuffer("11");
	    StringBuffer two = new StringBuffer("1");
		one.reverse();
		two.reverse();
		int sum = 0;
		int[] aa = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1048, 2096 };
		for(int i=0;i<one.length();i++) {
			if(one.charAt(i)!='0') {
				sum+=aa[i];
			}
		}
		
		for(int i=0;i<two.length();i++) {
			if(two.charAt(i)!='0') {
				sum+=aa[i];
			}
		}

		System.out.println(sum);
	}

}
