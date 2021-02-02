package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

/**
 * 选择排序, 固定位置排序
 */
public  class  SelectSort<T extends Comparable> implements Sort<T>{
    @Override
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
        Integer[] array=SortHelper.generateArray(100001230,100,200);
        SelectSort sort = new SelectSort();
        SortHelper.testSort(sort,array);
    }



    private static <T> void printArray(T[] array) {
        for (T element: array) {
            System.out.println(element);
        }
    }

    @Override
    public void checkSort() {

    }
}
