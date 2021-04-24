package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

import java.util.Arrays;

public class SortMain {
    private static final int number=10000;
    private static final int rangL=1;
    private static final int rangR=9000000;

    public static void main(String[] args) {
        System.out.println("数量级["+number+"] 近乎有序排序……");
        Integer[] array = SortHelper.generateNearlyOrderArray(number, rangL, rangR,10);
        Integer[] array2 = Arrays.copyOf(array, number);
        Integer[] array3 = Arrays.copyOf(array, number);
        Integer[] array4 = Arrays.copyOf(array, number);
        Integer[] array5 = Arrays.copyOf(array, number);

        Sort<Integer> selectSort = new SelectSort<>(array);
        SortHelper.testSort(selectSort,true);

        Sort<Integer> insertSort = new InsertSort<>(array2);
        SortHelper.testSort(insertSort,true);

        Sort<Integer> bubbleSort = new BubbleSort<>(array3);
        SortHelper.testSort(bubbleSort,true);

        Sort<Integer> cockTailSort = new CockTailSort<>(array4);
        SortHelper.testSort(cockTailSort,true);

        Sort<Integer> mergeSort = new MergeSort<>(array5);
        SortHelper.testSort(mergeSort,true);

        System.out.println("数量级["+number+"] 无序排序……");

        Integer[] array25 = SortHelper.generateArray(number, rangL, rangR);
        Integer[] array26 = Arrays.copyOf(array25, number);
        Integer[] array27 = Arrays.copyOf(array25, number);
        Integer[] array28 = Arrays.copyOf(array25, number);
        Integer[] array29 = Arrays.copyOf(array25, number);

        Sort<Integer> selectSort2 = new SelectSort<>(array25);
        SortHelper.testSort(selectSort2,true);

        Sort<Integer> insertSort2 = new InsertSort<>(array26);
        SortHelper.testSort(insertSort2,true);

        Sort<Integer> bubbleSort2 = new BubbleSort<>(array27);
        SortHelper.testSort(bubbleSort2,true);

        Sort<Integer> cockTailSort2 = new CockTailSort<>(array28);
        SortHelper.testSort(cockTailSort2,true);

        Sort<Integer> mergeSort2 = new MergeSort<>(array29);
        SortHelper.testSort(mergeSort2,true);

    }
}
