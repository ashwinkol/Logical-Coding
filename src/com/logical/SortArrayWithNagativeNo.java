package com.logical;
import java.util.*;
public class SortArrayWithNagativeNo {
	public static void main(String[] args) {
		int[] a = { 1, 5, -7, -11, 12, -12, 14, -21 };
		int k = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i] < 0) {
				int tmp = a[k];
				a[k] = a[i];
				a[i] = a[k];
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
