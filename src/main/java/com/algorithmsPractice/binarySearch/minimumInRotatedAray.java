package com.algorithmsPractice.binarySearch;

public class minimumInRotatedAray {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int min = nums[0];
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[left] <= nums[mid]) {
                    min = Math.min(nums[left], min);
                    left = mid + 1;
                    //start looking in right

                } else {
                    min = Math.min(nums[mid], min);
                    //start looking in left;
                    right = mid - 1;
                }
            }
            return min;
        }
}
