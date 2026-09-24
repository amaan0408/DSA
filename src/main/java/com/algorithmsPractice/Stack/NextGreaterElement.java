package com.algorithmsPractice.Stack;

public class NextGreaterElement {
    public int[] greatestElements(int[] arr) {
        //arr=[3, 7, 1, 2, 6]
        for(int i=0; i<arr.length; i++){
            int temp=arr[i];
            for(int j=i+1; j<arr.length; j++){
            if(arr[j]>arr[i]){
                arr[i]=arr[j];
                break;
            }
            }
            if(arr[i]==temp){
                arr[i]=-1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int [] arr = {3,7,1,2,6};
        nextGreaterElement.greatestElements(arr);
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
