package com.algorithmsPractice.sliding_window;

public class subarrayEqualsK {
    public int subarraySum(int[] nums, int k) {
        int left=0;
        int sum = 0;
        int count=0;
        for(int right=0; right<nums.length; right++){
            sum+=nums[right];
            if(sum==k || nums[right]==k){
                count++;
                sum-=nums[left];
                left++;
            }
            else if(sum>k){
                sum-=nums[left];
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        subarrayEqualsK obj = new subarrayEqualsK();
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(obj.subarraySum(nums, k));
    }
}
