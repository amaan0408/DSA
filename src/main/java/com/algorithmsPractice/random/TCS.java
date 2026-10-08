package com.algorithmsPractice.random;

import java.util.Scanner;

public class TCS {
    public int charges(int n){
        int sum=0;
        if(n<1) {
            return -1;
        }
        for(int i=1;i<=n;i++){
            if(i<=2){
                sum+=100;
            }
            else if(i>2&&i<6){
                sum+=50;
            }
            else if(i>5){
               sum+=20;
            }
        }
        return sum;
    }

    public int[] missingAndDuplicate(int arr[]){
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==arr[i-1]){
                return new int []{arr[i], arr[i]+1};
            }
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int arr [] = {1,0,0,1,0,0,0,1,1};
                    //0 1 2 3 4 5 6 7 8
        int index = 0;
        int maxIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                index++;
                maxIndex=Math.max(maxIndex,index);
            }
        }
    }
}
