package com.logical;

import java.util.*;

public class VectorTest {
	public static void main(String[] args) {

		Vector<Integer> a = new Vector<Integer>();

		for (int i = 1; i < 11; i++) {
			a.add(i);
		}

		System.out.println(a);

		for (int i = 0; i < 8; i++) {
			a.remove(i);
		}
		System.out.println(a);

	}

}
