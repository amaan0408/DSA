package com.algorithmsPractice.binarySearch;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right) {
            int mid =  (left+right)/2;
            if(nums[mid]<=nums[left]){
                //right is sorted
                if(target==nums[mid]){
                    return mid;
                }
                else if(target>nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                //left is sorted
            if(target>=nums[left] && target<=nums[mid]){
                if(target==nums[mid]){
                    return mid;
                }
                else if(target>nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                left = mid + 1;
            }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        SearchinRotatedSortedArray search = new SearchinRotatedSortedArray();
        int[] nums=new int[]{4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search.search(nums,target));
    }
}
