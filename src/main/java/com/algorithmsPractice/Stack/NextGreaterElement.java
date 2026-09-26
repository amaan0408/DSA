package com.algorithmsPractice.Stack;

import java.util.Stack;

public class NextGreaterElement {
    /*
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
     */
    public int[] greatestElements(int[] arr) {
        //arr=[3, 7, 1, 2, 6]
        int result [] = new int [arr.length];
     Stack<Integer> stack = new Stack<>();
     for(int i = 0; i < arr.length; i++){
      while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
          int popped = stack.pop();
          result[popped]=arr[i];
      }
      stack.push(i);
     }
     while(!stack.isEmpty()){
     result[stack.pop()]=-1;
     }
     return result;
    }

    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int [] arr = {3, 7, 1, 2, 6};
        int result [] = nextGreaterElement.greatestElements(arr);
        for(int k=0; k<result.length; k++){
            System.out.print(result[k]+" ");
        }
    }
    }
