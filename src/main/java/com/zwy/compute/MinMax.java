package com.zwy.compute;

import com.zwy.muke.sort.Helper.SortHelper;

public class MinMax {
    public static void main(String[] args) {
        Integer[] array1 = SortHelper.generateArray(1000000, 1, 100000);
        Integer[] array2 = SortHelper.generateArray(1000000, 1, 100000);
        change(array1,array2,1000000);
//        change2(array1,array2,1000000);
    }

    private static void change(Integer[] array1, Integer[] array2, int i) {
        long start = System.currentTimeMillis();
        for(int j=0;j<i;j++){
            if(array1[j]>array2[j]){
                Integer tem=array2[j];
                array2[j]=array1[j];
                array1[j]=tem;
            }
        }
        System.out.println("耗时："+(System.currentTimeMillis()-start));
    }
    private static void change2(Integer[] array1, Integer[] array2, int i) {
        long start = System.currentTimeMillis();
        for(int j=0;j<i;j++){
            int min=array1[j]<array2[j]?array1[j]:array2[j];
            int max=array1[j]>array2[j]?array1[j]:array2[j];

            array1[j]=min;
            array2[j]=max;
        }
        System.out.println("耗时："+(System.currentTimeMillis()-start));
    }
}
