package com.algorithmsPractice.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReturnHighestFreqOrSmallest {
    public int frequency(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > min) {
                min =  entry.getValue();
            }

        }
        return min;
    }
}
