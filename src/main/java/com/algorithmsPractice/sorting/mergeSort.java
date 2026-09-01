package com.algorithmsPractice.sorting;

public class mergeSort {

    public void mergeSorted(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSorted(arr, left, mid);
        mergeSorted(arr, mid + 1, right);

        int i = left;
        int j = mid + 1;
        int index = 0;

        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }


    /*
            if (left >= right) {
                return;
            }

            int mid = (left + right) / 2;

            mergeSorted(arr, left, mid);
            mergeSorted(arr, mid + 1, right);

            int i = left;
            int j = mid + 1;
            int index = 0;

            int[] temp = new int[right - left + 1];

            while (i <= mid && j <= right) {

                if (arr[i] <= arr[j]) {
                    temp[index++] = arr[i++];
                } else {
                    temp[index++] = arr[j++];
                }
            }

            while (i <= mid) {
                temp[index++] = arr[i++];
            }

            while (j <= right) {
                temp[index++] = arr[j++];
            }

            for (int x = 0; x < temp.length; x++) {
                arr[left + x] = temp[x];
            }
        }
     */
    public static void main(String[] args) {

        mergeSort ms = new mergeSort();

        int[] arr = {1, 6, 3, 9};

        ms.mergeSorted(arr, 0, arr.length - 1);

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println(Integer.compare(1,6));
    }
}
