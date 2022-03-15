package com.logical;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalenceBracket {

	public static boolean areBracketsBalanced(String exp) {

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < exp.length(); i++) {

			char s = exp.charAt(i);
			if (s == '(' || s == '{' || s == '[') {
				stack.push(s);
			}

			if (stack.isEmpty())
				return false;

			char check;
			switch (s) {

			case ')':

				check = stack.pop();
				if (check == '{' || check == '[') {
					return false;
				}
				break;

			case ']':

				check = stack.pop();
				if (check == '{' || check == '(') {
					return false;
				}
				break;

			case '}':

				check = stack.pop();
				if (check == '(' || check == '[') {
					return false;
				}
				break;

			}

		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {

		String expr = "()";

		// Function call
		if (areBracketsBalanced(expr))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");

	}

}
