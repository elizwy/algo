package com.zwy.muke.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort<T extends Comparable> extends AbstractSort<T>{

    public MergeSort(T[] array) {
        super(array);
    }

    @Override
    public T[] sort() {
       return sort1();
    }

    private T[] sort1() {
        return recursionSort(array,0,array.length-1);
    }

    private T[] recursionSort(T[] array, int left, int right) {
        Class<?> clazz=array.getClass().getComponentType();
        if(right==left){
            T[] result1 = (T[]) Array.newInstance(clazz, 1);
            result1[0]=array[left];
            return result1;
        }
        int middle=left+(right-left)/2;
        T[] a1=recursionSort(array,left,middle);
        T[] a2=recursionSort(array,middle+1,right);
        int size=a1.length+a2.length;
        T[] result =(T[]) Array.newInstance(clazz, size);

        doSort(a1, a2, size, result);

        return result;
    }

    private void doSort(T[] a1, T[] a2, int size, T[] result) {
        int a1Length= a1.length;
        int a2Length= a2.length;
        int m=0;
        int n=0;
        for(int i = 0; i< size; i++){
            if(m>a1Length-1){
                result[i]= a2[n];
                n++;
            }else if(n>a2Length-1){
                result[i]= a1[m];
                m++;
            }else if(a1[m].compareTo(a2[n])<1){
                result[i]= a1[m];
                m++;
            }else {
                result[i]= a2[n];
                n++;
            }
        }
    }


}
