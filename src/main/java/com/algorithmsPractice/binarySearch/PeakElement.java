package com.algorithmsPractice.binarySearch;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        PeakElement peak = new PeakElement();
        int[] arr = {2,1};
        System.out.println(peak.findPeakElement(arr));
    }
}
