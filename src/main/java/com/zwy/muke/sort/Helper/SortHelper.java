package com.zwy.muke.sort.Helper;

import java.util.Random;

public class SortHelper {

    public Integer[] generateArray(int size,int rangL,int rangR){
        Integer[] arrays = new Integer[size];
        Random random = new Random(System.currentTimeMillis());
        while (size>0){
            arrays[size-1]=random.nextInt(rangR-rangL)+rangL;
            size--;
        }
        return arrays;
    }

    public static void main(String[] args) {
        SortHelper sortHelper = new SortHelper();
        Integer[] result = sortHelper.generateArray(50, 300, 400);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
