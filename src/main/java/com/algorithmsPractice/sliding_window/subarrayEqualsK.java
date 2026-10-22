package com.algorithmsPractice.sliding_window;

import java.util.HashMap;

public class subarrayEqualsK {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,1);
            int prefixSum=0;
            int count=0;

            for(int i: nums){
                prefixSum+=i;
                if(map.containsKey(prefixSum-k)){
                    count+=map.get(prefixSum-k);
                }
                map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
            }
            return count;
        }

    public static void main(String[] args) {
        subarrayEqualsK obj = new subarrayEqualsK();
        int[] nums = {4,-1};
        int k = 3;
        System.out.println(obj.subarraySum(nums, k));
    }
}
