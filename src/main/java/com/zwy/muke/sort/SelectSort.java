package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

/**
 * 选择排序, 固定位置排序，保证有序增长
 * 时间复杂度： O(n^2)
 * 空间复杂度：
 * 缺点： 每个元素被访问多次，元素之间没有关系
 */
public  class  SelectSort<T extends Comparable> extends AbstractSort<T>{
    public SelectSort(T[] array) {
        super(array);
    }

    @Override
    public T[] sort(){
        int length=array.length;
        for(int i=0;i<length;i++){
            int minIndex=i;
            for(int j=i+1;j<length;j++){
                if(array[j].compareTo(array[minIndex])<0){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                swapElement(array,i,minIndex);
            }
        }
        return array;
    }

    private void swapElement(T[] array,int i, int minIndex) {
        if(i==minIndex) return;
        T temp=array[i];
        array[i]=array[minIndex];
        array[minIndex]=temp;
    }

    public static void main(String[] args) {
        Integer[] array=SortHelper.generateArray(100,100,200);
        SelectSort sort = new SelectSort(array);
        SortHelper.testSort(sort,true);
        sort.echo();
    }
}
