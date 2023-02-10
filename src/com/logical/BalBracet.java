package com.logical;

import java.util.Stack;

public class BalBracet {
	
	public static boolean isBal(String a ) {
		
		
		Stack<Character> x = new Stack<Character>();
		
		for (int i = 0; i < a.length(); i++) {
			
			char in = a.charAt(i);
			if (in=='(' || in == '{' || in == '[') {
				
				x.push(in);
			}
			
			if(x.isEmpty() || a.length() == 1 || stack.size() == s.length()) {
				return false;
			}
			
			char check;
			switch(in)  {
			
			case '}': 
				check = x.pop();
				if(check == '(' || check == '[') {
					return false;
				}
				break;
			
			case ')': 
				check = x.pop();

				if(check == '{' || check == '[') {
					return false;
				}
				break;
				
			case ']': 
				check = x.pop();

				if(check == '(' || check == '{') {
					return false;
				}
				break;
				
			}
			
		}
		
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		
		
		if(isBal("((")) {
			System.out.println("Balence");
		}
		
		else {
			System.out.println("Not Balenced");
		}
	}

}

//stack<char> st;
//
//for(int i = 0; i < s.length(); i++) {
//  
//  if(s[i] == '(' || s[i] == '[' || s[i] == '{')
//    st.push(s[i]);
//  else {
//    if(st.empty())
//      return false;
//    if(s[i] == ')' && st.top() != '(') 
//      return false;d
//    if(s[i] == ']' && st.top() != '[')
//      return false;
//    if(s[i] == '}' && st.top() != '{')
//      return false;
//    st.pop();      
//  }
//}
//  
//return st.empty();
