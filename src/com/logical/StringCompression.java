package com.logical;

public class StringCompression {
	public static void main(String[] args) {

		String in = "aabcccccaaa";
		char[] a = in.toCharArray();
		int count = 1;
		String ans = "";
		for (int i = 0; i < in.length() - 1; i++) {

			if (a[i] != a[i + 1]) {
				ans += (char) a[i];
				ans += count;
				count = 1;
			}
			if (a[i] == a[i + 1]) {
				count += 1;
			}
			
			if(i == in.length() - 2) {
				ans += (char) a[i];
				ans += count;
				count = 1;
			}
		}

		System.out.println(ans);
	}

}
