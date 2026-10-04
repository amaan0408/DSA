package com.algorithmsPractice.binarySearch;

public class firstOccurrence {
//    1, 2, 2, 2, 5, 8
    public int firstOcc(int arr[], int target){
        int i=0;
        int j=arr.length-1;
        int index=0;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==target){
                index=mid;
                j=mid-1;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return index;
    }
    public static void  main(String[] args) {
        firstOccurrence f = new firstOccurrence();
        int arr[] = {1, 2, 2, 2, 5, 8};

        System.out.println(f.firstOcc(arr, 2));
    }
}
