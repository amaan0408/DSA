package com.algorithmsPractice.HashSet;

import com.algorithmsPractice.random.arraySortedOrNo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();


        for (int i : nums1) {
            set.add(i);
        }
        for (int j : nums2) {
            if (set.contains(j)) {
                if (!list.contains(j)) {
                    list.add(j);
                }
            }
        }
        int arr[] = new int [list.size()];
        for(int i=0; i< list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        IntersectionOfArray a = new IntersectionOfArray();
        int arr[] = {1,3,23,5};
        int arr2[] = {1,4,23,0};
        int[] result = a.intersection(arr, arr2);
        for(int i: result){
            System.out.println(i);
        }

    }
}
