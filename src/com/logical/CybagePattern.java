package com.logical;

import java.util.HashMap;

public class CybagePattern {

	public static void main(String[] args) {

		String space = "";
		int count = 0;
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(0, "");
		m.put(1, "  ");
		m.put(2, "     ");
		boolean a = true;
		for (int i = 0; i < 101; i++) {

			if (a) {

				space = m.get(count);
				System.out.print(space + "" + i);
				System.out.println();

				if (count == 2) {
					a = false;
					count = 0;
					i += 1;
				}

				if (count != 2) {
					count += 1;
				}

			}

			if (!(a)) {

				space = m.get(count);
				System.out.print(space + "" + i);
				System.out.println();
				space = "";
				count -= 1;
			}

			if (count == 0) {
				a = true;
			}
		}

	}

}
