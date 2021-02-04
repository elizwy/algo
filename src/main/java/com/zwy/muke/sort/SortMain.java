package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        Integer[] array = SortHelper.generateNearlyOrderArray(100, 1000, 2000);
        Integer[] array2 = Arrays.copyOf(array, array.length);

        SelectSort<Integer> selectSort = new SelectSort<>(array);
        SortHelper.testSort(selectSort,true);

        InsertOrder<Integer> insertOrder = new InsertOrder<>(array2);
        SortHelper.testSort(insertOrder,true);


    }
}
