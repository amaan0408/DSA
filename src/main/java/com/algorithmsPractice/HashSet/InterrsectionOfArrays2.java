package com.algorithmsPractice.HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InterrsectionOfArrays2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                if(map.get(nums2[i]) == 1){
                    map.remove(nums2[i]);
                }
                else {
                    map.put(nums2[i], map.get(nums2[i]) - 1);
                }
            }
        }
        int arr [] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        InterrsectionOfArrays2 a = new InterrsectionOfArrays2();
        int arr[] = {1,2,2,1};
        int arr2[] = {2,2};
        int[] result = a.intersect(arr, arr2);
        for(int i: result){
            System.out.println(i);
        }

    }
}
