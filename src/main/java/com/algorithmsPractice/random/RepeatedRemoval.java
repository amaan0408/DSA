package com.algorithmsPractice.random;

public class RepeatedRemoval {
    public int Remove(int arr[]){
        int count = 0;

        int i=0;
        int j=i+1;
        int index=0;


        while(i<arr.length && j<arr.length){
            boolean flag = false;
            if(arr[i]<arr[j]){
                arr[i]=arr[j];
                if(flag!=true){
                    count++;
                    flag=true;
                }
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
   return  count;
    }
    public static void main(String[] args) {
        RepeatedRemoval r = new RepeatedRemoval();
        int arr [] = {6,1 ,5 ,2 ,4 ,3};
        //6 1 5 2 4 3
        System.out.println(r.Remove(arr));
    }
}

