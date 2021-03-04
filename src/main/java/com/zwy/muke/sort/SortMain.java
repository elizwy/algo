package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        System.out.println("近乎有序排序……");
        Integer[] array = SortHelper.generateNearlyOrderArray(10000, 1, 9000000);
        Integer[] array2 = Arrays.copyOf(array, array.length);
        Integer[] array3 = Arrays.copyOf(array, array.length);

        SelectSort<Integer> selectSort = new SelectSort<>(array);
        SortHelper.testSort(selectSort,true);

        InsertSort<Integer> insertSort = new InsertSort<>(array2);
        SortHelper.testSort(insertSort,true);

        BubbleSort<Integer> bubbleSort = new BubbleSort<>(array3);
        SortHelper.testSort(bubbleSort,true);

        System.out.println("无序排序……");

        Integer[] array4 = SortHelper.generateArray(10000, 1, 9000000);
        Integer[] array5 = Arrays.copyOf(array4, array4.length);
        Integer[] array6 = Arrays.copyOf(array4, array4.length);

        SelectSort<Integer> selectSort2 = new SelectSort<>(array4);
        SortHelper.testSort(selectSort2,true);

        InsertSort<Integer> insertSort2 = new InsertSort<>(array5);
        SortHelper.testSort(insertSort2,true);

        BubbleSort<Integer> bubbleSort2 = new BubbleSort<>(array6);
        SortHelper.testSort(bubbleSort2,true);


    }
}
