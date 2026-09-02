package com.algorithmsPractice.random;

import java.util.HashMap;

public class FirstNonRepeatingElementArray {
    public int repeated(int [] arr){
        // [7 3 7 2 3 9]
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int k=0; k<arr.length;k++){
            if(map.containsKey(arr[k]) && map.get(arr[k])==1){
                return arr[k];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstNonRepeatingElementArray nr = new FirstNonRepeatingElementArray();
        int arr [] = {11,22,33,33,22,11,11,22};
        System.out.println(nr.repeated(arr));
    }
}
