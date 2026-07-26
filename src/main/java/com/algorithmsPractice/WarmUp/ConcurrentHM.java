package com.algorithmsPractice.WarmUp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM {
    static Map<Integer, Integer> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws Exception {
    Thread t1 = new Thread(() -> {
        for(int i=0; i<100000; i++){
        map.put(i, i);
        }
    });

        Thread t2 = new Thread(() -> {
            for(int i=100000; i<200000; i++){
                map.put(i, i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map.size());

    }
}
