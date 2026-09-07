package com.algorithmsPractice.random;

import java.util.Arrays;

public class RotateArray {
    public int [] rotate(int[] arr, int k) {

        for(int x=0; x<k; x++) {
            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        return arr;
    }
    public static  void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int arr [] ={1,2,3,4,5};
        int result [] = rotateArray.rotate(arr,3);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
