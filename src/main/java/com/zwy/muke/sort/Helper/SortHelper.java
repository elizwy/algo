package com.zwy.muke.sort.Helper;

import com.zwy.muke.sort.Sort;


import java.util.Random;

public class SortHelper {

    public static Integer[] generateArray(int size,int rangL,int rangR){
        if(rangR<=rangL){
            throw new RuntimeException("右区间必须大于左区间");
        }
        Integer[] arrays = new Integer[size];
        Random random = new Random(System.currentTimeMillis());
        while (size>0){
            arrays[size-1]=random.nextInt(rangR-rangL)+rangL;
            size--;
        }
        return arrays;
    }

    public static Integer[] generateNearlyOrderArray(int size,int rangL,int rangR,int unOrderSize){
        if(rangR<=rangL){
            throw new RuntimeException("右区间必须大于左区间");
        }
        if(size>(rangR-rangL)){
            throw new RuntimeException("可选空间不足");
        }
        Integer[] arrays = new Integer[size];
        for(int i=0;i<size;i++){
            arrays[i]=i+rangL;
        }

        Random random = new Random(System.currentTimeMillis());
        for(int i=0;i<unOrderSize;i++){
            int l=random.nextInt(size);
            int r=random.nextInt(size);
            swap(arrays,l,r);
        }


        return arrays;
    }

    private static void swap(Integer[] arrays, int i, int j) {
        int tmp=arrays[i];
        arrays[i]=arrays[j];
        arrays[j]=arrays[i];
    }


    public static <T> void testSort(Sort sort,Boolean check){
        long startTime=System.currentTimeMillis();
        Object[] result = sort.sort();
        long endTime=System.currentTimeMillis();
        System.out.println(sort.getClass().getSimpleName()+"耗时:["+(endTime-startTime)+"]毫秒");
        if(check){
            sort.checkSort(result);
        }
    }

    public static void main(String[] args) {
        SortHelper sortHelper = new SortHelper();
        Integer[] result = sortHelper.generateArray(50, 300, 400);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
