package com.logical;

import java.util.Random;

public class RandomGenrator {
	public static void main(String[] args) {
		Random r = new Random();

		int a = (int) r.nextInt((9 - 0) + 1) + 0;
		switch (a) {
		case 1:
			System.out.println(a+" Green");
			break;
		case 2:
			System.out.println(a+" Red");
			break;
		case 3:
			System.out.println(a+" Voilet");
			break;
		case 4:
			System.out.println(a+" Green");
			break;
		case 5:
			System.out.println(a+" Red");
			break;
		case 6:
			System.out.println(a+" Voilet");
			break;

		case 7:
			System.out.println(a+" Green");
			break;
		case 8:
			System.out.println(a+" Red");
			break;
		case 9:
			System.out.println(a+" Voilet");
			break;
		}
	}

}
