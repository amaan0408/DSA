package com.algorithmsPractice.binarySearch;

public class firstandlastposition {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int index = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result[0] = mid;  // instead of index++
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left=0;
        right=nums.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result[1] = mid;  // instead of index++
                left=mid+1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        firstandlastposition obj = new firstandlastposition();
        int[] nums=new int[]{5,7,7,8,8,10};
        int result [] = obj.searchRange(nums,8);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
