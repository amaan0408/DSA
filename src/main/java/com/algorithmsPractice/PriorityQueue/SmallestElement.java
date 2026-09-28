package com.algorithmsPractice.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class SmallestElement {
    public int findSmallest(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int n: arr){
            if(queue.size() < k){
                queue.offer(n);
            }
            else if(n<queue.peek()){
                queue.poll();
                queue.offer(n);
            }
        }
        return queue.peek();
    }
    public static void main(String[] args) {
        SmallestElement smallestElement = new SmallestElement();
        int arr[] = {5, 1, 8, 3, 2, 9, 4};

        System.out.println(smallestElement.findSmallest(arr, 2));
    }
}
