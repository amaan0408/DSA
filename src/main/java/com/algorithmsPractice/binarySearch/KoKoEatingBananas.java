package com.algorithmsPractice.binarySearch;

public class KoKoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int max = piles[0];
        for (int p : piles) {
            if (p > max) {
                max = p;
            }
        }
        int right = max;

        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int p : piles) {
                if (p % mid != 0) {
                    count += 1;
                }
                count += p / mid;
            }
            if (count > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
