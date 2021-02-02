package com.zwy.muke.sort.Helper;

import com.zwy.muke.sort.Sort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class SortHelper {
    private static final Logger logger= LoggerFactory.getLogger("SortHelper");

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

    public static <T> void testSort(Sort sort,T[] array){
        long startTime=System.currentTimeMillis();
        Object[] result = sort.sort(array);
        long endTime=System.currentTimeMillis();
        System.out.println("耗时:["+(endTime-startTime)+"]毫秒");
        sort.checkSort(result);
    }

    public static void main(String[] args) {
        SortHelper sortHelper = new SortHelper();
        Integer[] result = sortHelper.generateArray(50, 300, 400);
        for (int i: result) {
            System.out.println(i);
        }
    }
}
