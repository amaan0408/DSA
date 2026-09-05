package com.algorithmsPractice.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            HashMap<Character, Character> map = new HashMap<>();
            map.put('(', ')');
            map.put('{', '}');
            map.put('[', ']');

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (map.get(stack.peek()) != c) { // if stored Key is not equal to Incoming char.
                        return false;
                    }
                    stack.pop();
                }
            }
            return stack.isEmpty();
    }
}
