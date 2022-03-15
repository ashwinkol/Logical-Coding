package com.logical;

import java.util.*;

public class IntToArraySpecificIndex {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		int[] x = { 3, 6, 7, 8, 9 };
		Arrays.sort(x);
		int target = 11;

		for (int f : x) {
			li.add(f);
		}

		int contains = Collections.frequency(li, target);

		if (contains > 0) {
			for (int i = 0; i < li.size(); i++) {
				if (x[i] == target) {
					System.out.println(target + " Exist at Index: " + i);
				}
			}
		} else if (contains == 0) {
			for (int i = 0; i < li.size(); i++) {
				if (x[i] == (target - 1)) {
					System.out.println(target + " Should be Located at Index: " + (i + 1));
				}

				if (x[i] == (target + 1)) {
					System.out.println(target + " Should be Located at Index: " + i);

				}

			}

		}

	}
}
