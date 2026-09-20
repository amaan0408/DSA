package com.algorithmsPractice.random;

public class LastWordsLength {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean flag = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++; // Count characters of the word
            } else if (len > 0) {
                break; // Stop when hitting a space AFTER starting the word
            }
        }

        return len;
    }
    public static void main(String[] args) {
        LastWordsLength lastWordsLength = new LastWordsLength();
        String str = "absoletly not to worry";
        System.out.println(lastWordsLength.lengthOfLastWord(str));
    }
}
