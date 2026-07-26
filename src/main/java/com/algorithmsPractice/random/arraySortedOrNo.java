package com.algorithmsPractice.random;

public class arraySortedOrNo {

        public int isSorted(int[] arr){
            for(int i=1; i<arr.length; i++){
                if(arr[i-1]>arr[i]){
                    return i;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        arraySortedOrNo a = new arraySortedOrNo();
        int arr[] = {1,3};
        System.out.println(a.isSorted(arr));
        }
    }

