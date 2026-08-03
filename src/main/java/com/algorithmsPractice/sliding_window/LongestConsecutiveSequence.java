package com.algorithmsPractice.sliding_window;

import com.algorithmsPractice.random.TrailingZeros;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int len=0;
        int maxLen = 1;
        int duplicate=0;

        for(int right=1; right<nums.length; right++){
            if(nums[right]==nums[right-1]){
                duplicate++;
            }
            if(nums[right]==nums[right-1]+1){
                len=(right-left+1)-duplicate;
                maxLen=Math.max(len,maxLen);
            }
            else {
                left=right;
                duplicate = 0;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence nums = new LongestConsecutiveSequence();
        int [] arr = {1,0,1,2};
        int result = nums.longestConsecutive(arr);
        System.out.println(result);
    }
}
