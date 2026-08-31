package com.algorithmsPractice.random;

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
        TCS tcs = new TCS();
        int arr [] = {10, 11, 12, 13, 13, 15, 16};
        int result [] = tcs.missingAndDuplicate(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
