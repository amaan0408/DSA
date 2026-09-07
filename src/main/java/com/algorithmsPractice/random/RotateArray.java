package com.algorithmsPractice.random;

public class RotateArray {

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public int[] rotate(int[] nums, int k) {
        k %= nums.length;

        // 1. Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);

        // 3. Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    public static  void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int arr [] ={1,2,3,4,5};
        int result[] = rotateArray.rotate(arr,3);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
