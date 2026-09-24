package com.algorithmsPractice.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestElement {
    public int findSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n: arr){
            if(pq.size()<k){
                pq.offer(n);
            }
            else if(n<pq.peek()){
             pq.poll();
             pq.offer(n);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        SmallestElement smallestElement = new SmallestElement();
        int arr[] = {5, 1, 8, 3, 2, 9, 4};

        System.out.println(smallestElement.findSmallest(arr, 2));
    }
}
