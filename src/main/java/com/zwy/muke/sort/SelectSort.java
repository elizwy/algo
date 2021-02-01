package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

/**
 * 选择排序, 固定位置排序
 */
public  class  SelectSort<T extends Comparable> {
    public void sort(T[] array){
        int length=array.length;
        for(int i=0;i<length;i++){
            int minIndex=i;
            for(int j=i+1;j<length;j++){
                if(array[j].compareTo(array[minIndex])<0){
                    minIndex=j;
                }
            }
            swapElement(array,i,minIndex);
        }
    }

    private void swapElement(T[] array,int i, int minIndex) {
        if(i==minIndex) return;
        T temp=array[i];
        array[i]=array[minIndex];
        array[minIndex]=temp;
    }

    public static void main(String[] args) {
        SortHelper sortHelper = new SortHelper();
        Integer[] array=sortHelper.generateArray(100,100,200);
        SelectSort sort = new SelectSort();
        sort.sort(array);
        printArray(array);


        Double[] array1=new Double[]{6.0,-3.0,0.0,8.0,9.0,-2.0,5.0,1.0,7.0};
        SelectSort sort1 = new SelectSort();
        sort1.sort(array1);
        printArray(array1);
    }



    private static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.println(element);
        }
    }
}
