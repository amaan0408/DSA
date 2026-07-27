package com.algorithmsPractice.frequencyArray;

import com.algorithmsPractice.BetterWinsOutright.Longest_word;

public class nonRepeatingChar {
    public int firstNonRepeatingCharacter(String str) {
        //leetcode
        int fre[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            fre[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (fre[str.charAt(i) - 'a'] == 1) {
                return i; // Found the first unique char in original string order!
            }
        }
        /*
        int fre[] = new int[256]; // Covers all ASCII characters

    for (int i = 0; i < str.length(); i++) {
        fre[str.charAt(i)]++; // Direct ASCII conversion without - 'a'
    }

    for (int i = 0; i < str.length(); i++) {
        if (fre[str.charAt(i)] == 1) {
            return i;
        }
    }
         */
        return -1;
    }

    public static void main(String[] args) {
        nonRepeatingChar obj = new nonRepeatingChar();
        String str = "eetcode";
        int result = obj.firstNonRepeatingCharacter(str);
        System.out.println(result);

    }
}
