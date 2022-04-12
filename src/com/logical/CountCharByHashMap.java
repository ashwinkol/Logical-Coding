package com.logical;

import java.util.HashMap;

public class CountCharByHashMap {
	public static void main(String[] args) {

		String input = "India";

		HashMap<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int word = (int) ch;

			// If Occured Character is Capital Letter then Convert it to Small

			if (word < 97) {
				ch = (char) (word + 32);
			}
			if (hashMap.containsKey(ch)) {
				int val = hashMap.get(ch);
				hashMap.put(ch, val + 1);
			} else {
				hashMap.put(ch, 1);
			}
		}
		System.out.println("Word Count: "+hashMap);
	}
}
