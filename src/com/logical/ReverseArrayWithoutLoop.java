package com.logical;
import java.util.*;
public class ReverseArrayWithoutLoop {
	public static void main(String[] args) {
        Integer[] a  = {1,4,5,2,1,2,3,4,6,7,8,9};
        List<Integer> b = Arrays.asList(a);
        Collections.reverse(b);
        System.out.println(b);
	}

}
