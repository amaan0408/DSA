package com.algorithmsPractice.random;

public class secondLargestElement {
    public int secondLargest(int[] arr){
        if(arr.length==1){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int secMax = max;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
            secMax=max;
            max=arr[i];
            }
            else if(arr[i]>secMax && arr[i]!=max){
                    secMax = arr[i];
            }
        }
        return (secMax == Integer.MIN_VALUE) ? -1 : secMax;
    }
    public static void main(String[] args) {
        secondLargestElement nums = new secondLargestElement();
        int arr [] = {2,2,2,2};
        int result = nums.secondLargest(arr);
        System.out.println(result);
    }
}
