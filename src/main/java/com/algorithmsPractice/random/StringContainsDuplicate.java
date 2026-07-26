package com.algorithmsPractice.random;

import java.util.HashMap;
import java.util.Map;

public class StringContainsDuplicate {
    public boolean hasDuplicateCharacters(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
             return true;
            }
        }
    return false;
    }
    public static void main(String[] args) {
        StringContainsDuplicate a = new StringContainsDuplicate();
        String str = "javtt";
        System.out.println(a.hasDuplicateCharacters(str));
    }
}
