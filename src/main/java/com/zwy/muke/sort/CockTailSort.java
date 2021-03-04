package com.zwy.muke.sort;

/**
 *  双向的冒泡排序
 */
public class CockTailSort<T extends Comparable> extends AbstractSort<T> {

    public CockTailSort(T[] array) {
        super(array);
    }

    @Override
    public T[] sort() {
        int length=array.length;
        int left=0;
        int right=length-1;
        int change=1;
        while (left<right && change==1){
            change=0;
            for (int i = left; i < array.length-1; i++) {
                if(array[i].compareTo(array[i+1])>0){
                    swap(i,i+1);
                    change=1;
                }
            }
            right--;
            for (int i = right; i >left ; i--) {
                if(array[i].compareTo(array[i-1])<0){
                    swap(i-1,i);
                    change=1;
                }
            }
            left++;
        }
        return array;
    }
}
