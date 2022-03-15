package com.logical;
import java.util.*;
public class MergeTwoList {
	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(12);
		l1.add(10);
		l1.add(8);
		System.out.println("List No 1: "+l1);
		
		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(1);
		l2.add(7);
		l2.add(19);
		System.out.println("List No 2: "+l2);
		
		LinkedList<Integer> merge = new LinkedList<Integer>();
		merge.addAll(l1);
		merge.addAll(l2);
		Collections.sort(merge);
		
		System.out.println("Combined And Sorted List: "+merge);
	}

}
