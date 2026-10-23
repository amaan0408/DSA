package com.algorithmsPractice.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '[' || ch == '{' || ch == '(') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (s.charAt(i) == ')' && stack.peek() == '('
                                || s.charAt(i) == '}' && stack.peek() == '{'
                                || s.charAt(i) == ']' && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }
            return stack.isEmpty();
    }
}
