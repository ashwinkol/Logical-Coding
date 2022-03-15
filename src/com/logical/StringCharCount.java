package com.logical;

//Output Should be B-2 i-2 t-4 e-2 r-2
public class StringCharCount {
	public static void main(String[] args) {
		String a = "Bitter bitter";
		char[] x = a.toCharArray();

		String ans = "";
		int i = 0;
		while (i < x.length - 1) {
			if (x[i] == ' ') {
				i += 1;
			}

			int count = 1;
			for (int j = i + 1; j < x.length; j++) {

				if (x[i] == x[j] || x[i] + 32 == x[j]) {
					count += 1;
					x[j] = ' ';

				}

			}
			if (x[i] != ' ') {
				ans += " " + x[i];
				ans += "-" + count;
				x[i] = ' ';
				i++;
			}

		}

		System.out.println(" " + ans);
	}

}
