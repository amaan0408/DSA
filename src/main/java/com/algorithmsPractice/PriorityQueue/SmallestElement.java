package com.algorithmsPractice.PriorityQueue;

import java.util.PriorityQueue;

public class SmallestElement {
    public int findSmallest(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x: arr){
            pq.offer(x);
        }
        int count=0;
        int result=0;
        while(!pq.isEmpty()){
            int x = pq.poll();
          if(count==2){
              return x;
          }
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
        SmallestElement smallestElement = new SmallestElement();
        int arr[] = {5, 1, 8, 3, 2, 9, 4};

        System.out.println(smallestElement.findSmallest(arr));
    }
}
