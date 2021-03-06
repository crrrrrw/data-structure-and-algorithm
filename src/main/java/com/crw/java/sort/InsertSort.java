package com.crw.java.sort;

/**
 * 直接插入排序
 * <p>
 * 时间复杂度：O(n^2)；空间复杂度为O(1)；稳定的排序
 * 适用于n很小的情况
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 56, 23, 12, 33, 18, 24};
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] arr) {
        int idx; // 有序子表索引位置
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) { // 比较，将i插入有序子表
                int temp = arr[i]; // 待插入元素
                for (idx = i - 1; idx >= 0 && arr[idx] > temp; idx--) { // 从已排序数列的最后一个比较
                    arr[idx + 1] = arr[idx]; // 记录后移
                }
                arr[idx + 1] = temp; // 待排序元素插入
                print(arr, i, idx + 1);
            }
        }
    }

    private static void print(int[] arr, int i, int low) {
        System.out.print("第" + i + "次结果: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
            if (j == arr.length - 1) {
                System.out.print("要插入的索引值：" + low);
                System.out.println();
            }
        }
    }

}
