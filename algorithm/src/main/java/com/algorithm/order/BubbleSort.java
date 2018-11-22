package com.algorithm.order;

/**
 * 基本的排序算法
 * 
 * @author apple
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 8, 5, 13, 13 };
        int[] result = sortByBubbleMinToMax(arr);
        for (int item : result) {
            System.out.print(item + " ");
        }
        System.out.println();

        int[] result1 = sortByBubbleMaxToMin(arr);
        for (int item : result1) {
            System.out.print(item + " ");
        }
    }

    /**
     * 冒泡排序 从小到大 时间复杂度 O(n2) 最坏 O(n2) 最好O(n) 空间复杂度 O(1) 稳定排序
     */
    public static int[] sortByBubbleMinToMax(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序 从大到小
     */
    public static int[] sortByBubbleMaxToMin(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
