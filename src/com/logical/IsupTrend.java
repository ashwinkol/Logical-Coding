package com.logical;

//Question asked in MountBlue
public class IsupTrend {
	public static boolean isUpTrend(int[] a) {

		boolean[] b = new boolean[57];

		for (int i = 0; i < a.length; i++) {
			char c = (char) a[i];
			char d = (char) a[i+1];
			int y = d;
			int x = c;
			
			for (int j = x; j < d; j++) {
				b[x] = true;
			}
			if (b[x] == true) {
				return false;
			}
			b[x] = true;

		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 6, 5, 7, 8 };

		System.out.println(isUpTrend(a));

	}
}
