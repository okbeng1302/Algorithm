package com.algorithm.select;

import com.algorithm.order.BubbleSort;

/**
 * @desc 给你一个数组，返回第 k 个 大的值
 * @author apple
 */
public class SelectKthValue {

    public static void main(String[] args) {

        int[] arr = { 10, 5, 3, 6, 9, 511 };
        int k = 3;
        int result = findKOne(arr, k);
        System.out.println(result);
        int result1 = findKTwo(arr, k);
        System.out.println(result1);
    }

    /**
     * 先排序，在放回第k个大的值
     * 
     * @param arr
     * @param k
     */
    public static int findKOne(int[] arr, int k) {
        if (k == 0 || arr.length < k) {
            return 0;
        }
        BubbleSort.sortByBubbleMaxToMin(arr);
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        return arr[k - 1];
    }

    /**
     * 先生成长度为 k 的数组，然后放到数组中，返回最后一个
     * 
     * @param arr
     * @param k
     */
    public static int findKTwo(int[] arr, int k) {
        if (arr.length == 0 || arr.length < k) {
            return 0;
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        BubbleSort.sortByBubbleMaxToMin(result);
        for (int i = k; i < arr.length; i++) {
            if (result[k - 1] < arr[i]) {
                result[k - 1] = arr[i];
                BubbleSort.sortByBubbleMaxToMin(result);
            }
        }
        return result[k - 1];
    }
}
