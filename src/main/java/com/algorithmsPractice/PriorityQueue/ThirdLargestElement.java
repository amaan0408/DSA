package com.algorithmsPractice.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class ThirdLargestElement {
    public int findLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : arr) {
            if(pq.size()<k){
                pq.offer(a);
            }
            else if(a>pq.peek()){
                 pq.poll();
                 pq.offer(a);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        ThirdLargestElement l = new ThirdLargestElement();
        int arr[] = {5, 1, 8, 3, 2, 9, 4};
        System.out.println(l.findLargest(arr, 2));
    }
}
