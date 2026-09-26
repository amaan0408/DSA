package com.algorithmsPractice.sliding_window;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int len=0;
        int maxLen=0;
        int left=0;
        for(int i=0; i<s.length(); i++){
            char right = s.charAt(i);
            if(!set.contains(right)){
                set.add(right);
                len=i-left+1;
                maxLen=Math.max(len, maxLen);
            }
            else {
                while(set.contains(right)){
                    char leftChar = s.charAt(left);
                    set.remove(leftChar);
                    left++;
                }
                set.add(right);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters a = new  LongestSubstringWithoutRepeatingCharacters();
        System.out.println(a.lengthOfLongestSubstring("abcabcbb"));
    }
}
