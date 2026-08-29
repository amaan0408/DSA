package com.algorithmsPractice.random;

import java.util.*;

public class FreqAsc {
    public int [] freqAsc(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(entry);
        }
        Collections.sort(list, (a,b) -> Integer.compare(a.getValue(), b.getValue()));
        int[] result = new int[arr.length];
        int index = 0;

        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                result[index++] = entry.getKey();
            }
        }
return result;
    }
    public static void main(String[] args) {
        FreqAsc a = new FreqAsc();
        int arr [] = {2, 3 ,2 ,4, 3, 2, 4, 5};
        int result [] = a.freqAsc(arr);
        for(int j=0; j<result.length; j++){
            System.out.print(result[j]+" ");
        }
    }
}
