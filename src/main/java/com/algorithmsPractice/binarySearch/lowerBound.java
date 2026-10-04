package com.algorithmsPractice.binarySearch;

public class lowerBound {
    //    1, 2, 2, 2, 5, 8
    public int firstBound(int arr[], int target){
        int i=0;
        int j=arr.length-1;
        int index=-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>=target){
                index=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return index;
    }
    public static void  main(String[] args) {
        lowerBound f = new lowerBound();

        int arr[] = {1, 2, 4, 4, 7, 9};

        System.out.println(f.firstBound(arr, 4));
    }
}
