package com.logical;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {

	 private static Map<String, List<String>> graph = new HashMap<>();

	    private static boolean search(String name) {
	        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
	        System.out.println(searchQueue);
	        // This list is how you keep track of which people you've searched before.
	        List<String> searched = new ArrayList<>();

	        while (!searchQueue.isEmpty()) {
	            String person = searchQueue.poll();
	            System.out.println(person);
	            // Only search this person if you haven't already searched them
	            if (!searched.contains(person)) {
	                if (person_is_seller(person)) {
	                    System.out.println(person + " is a mango seller!");
	                    return true;
	                } else {
	                    searchQueue.addAll(graph.get(person));
	                    // Marks this person as searched
	                    searched.add(person);
	                }
	            }
	        }

	        return false;
	    }

	    private static boolean person_is_seller(String name) {
	        return name.endsWith("m");
	    }

	    public static void main(String[] args) {
	        graph.put("you", Arrays.asList("alice", "bob", "claire"));
	        graph.put("bob", Arrays.asList("anuj", "peggy"));
	        graph.put("alice", Arrays.asList("peggy"));
	        graph.put("claire", Arrays.asList("thom", "jonny"));
	        graph.put("anuj", Collections.emptyList());
	        graph.put("peggy", Collections.emptyList());
	        graph.put("thom", Collections.emptyList());
	        graph.put("jonny", Collections.emptyList());

	        search("you");
	    }
}
