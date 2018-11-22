package com.algorithm.order;

/**
 * 基本的排序算法
 * 
 * @author apple
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 8, 5, 13 };
        int[] result = sortByBubbleMinToMax(arr);
        for (int item : result) {
            System.out.print(item + " ");
        }
        int[] result1 = sortByBubbleMaxToMin(arr);
        for (int item : result1) {
            System.out.print(item + " ");
        }
    }

    /**
     * 冒泡排序 从小到大
     */
    public static int[] sortByBubbleMinToMax(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
