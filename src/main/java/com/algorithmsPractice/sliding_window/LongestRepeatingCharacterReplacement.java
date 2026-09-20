package com.algorithmsPractice.sliding_window;

import java.util.*;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int maxFreq = 0;
        int count=0;
        int fre[] = new int [26];
        int left = 0;
        int len = 0;
        int maxLen = 0;

       Map<Integer, Map<String, Boolean>> map = new HashMap<>();


        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            fre[ch-'A']++;
            maxFreq = Math.max(maxFreq, fre[ch-'A']);

            int win = right-left+1;
            int replacement = win-maxFreq;
            if(replacement<=k){
                len=right-left+1;
                maxLen=Math.max(maxLen,len);
            }
            while (right - left + 1 - maxFreq > k) {
                fre[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        LongestRepeatingCharacterReplacement a = new LongestRepeatingCharacterReplacement();
        int result = a.characterReplacement("AABABBA", 1);
        System.out.println(result);
    }
}
