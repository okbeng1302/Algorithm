package com.algorithm.select;

/**
 * 二分查找
 * 
 * @author apple
 */
public class SecondQuery {

    public static void main(String[] args) {
        System.out.print(query(new int[] { 1, 2, 4, 6, 8 }, 6, 0, 5));
    }

    public static int query(int[] arr, int value, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == value)
            return mid;
        if (arr[mid] > value)
            return query(arr, value, low, mid - 1);
        if (arr[mid] < value)
            return query(arr, value, mid + 1, high);
        return -1;
    }
}
