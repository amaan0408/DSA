package com.algorithmsPractice.random;

public class secondLargestElement {
    public int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = max;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
            secMax=max;
            max=arr[i];
            }
            else if(arr[i]>secMax){
                    secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        secondLargestElement nums = new secondLargestElement();
        int arr [] = {1,2,8,5};
        int result = nums.secondLargest(arr);
        System.out.println(result);
    }
}
