package com.algorithmsPractice.random;

public class arraySortedOrNo {

        public boolean isSorted(int[] arr){
            for(int i=1; i<arr.length; i++){
                if(arr[i-1]>arr[i]){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        arraySortedOrNo a = new arraySortedOrNo();
        int arr[] = {-5,-2,1};
        System.out.println(a.isSorted(arr));
        }
    }

