package com.algorithmsPractice.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumLookUp {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                return new int []{map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int [] {-1,-1};
    }
    public static  void main(String[] args) {
        TwoSumLookUp twoSumLookUp = new TwoSumLookUp();
        int [] arr = {1, 2, 3,4,5};
        int target = 9;


    }
}
