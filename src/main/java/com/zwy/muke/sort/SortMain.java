package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        System.out.println("近乎有序排序……");
        Integer[] array = SortHelper.generateNearlyOrderArray(10000, 1, 9000000,10);
        Integer[] array2 = Arrays.copyOf(array, array.length);
        Integer[] array3 = Arrays.copyOf(array, array.length);
        Integer[] array4 = Arrays.copyOf(array, array.length);

        SelectSort<Integer> selectSort = new SelectSort<>(array);
        SortHelper.testSort(selectSort,true);

        InsertSort<Integer> insertSort = new InsertSort<>(array2);
        SortHelper.testSort(insertSort,true);

        BubbleSort<Integer> bubbleSort = new BubbleSort<>(array3);
        SortHelper.testSort(bubbleSort,true);

        CockTailSort<Integer> cockTailSort = new CockTailSort<>(array4);
        SortHelper.testSort(cockTailSort,true);

        System.out.println("无序排序……");

        Integer[] array25 = SortHelper.generateArray(10000, 1, 9000000);
        Integer[] array26 = Arrays.copyOf(array25, array25.length);
        Integer[] array27 = Arrays.copyOf(array25, array25.length);
        Integer[] array28 = Arrays.copyOf(array25, array25.length);

        SelectSort<Integer> selectSort2 = new SelectSort<>(array25);
        SortHelper.testSort(selectSort2,true);

        InsertSort<Integer> insertSort2 = new InsertSort<>(array26);
        SortHelper.testSort(insertSort2,true);

        BubbleSort<Integer> bubbleSort2 = new BubbleSort<>(array27);
        SortHelper.testSort(bubbleSort2,true);

        CockTailSort<Integer> cockTailSort2 = new CockTailSort<>(array28);
        SortHelper.testSort(cockTailSort2,true);

    }
}
