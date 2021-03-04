package com.zwy.muke.sort;

public class BubbleSort <T extends Comparable> extends AbstractSort<T>{
    public BubbleSort(T[] array) {
        super(array);
    }

    /**
     * 增加标识位，当一趟排序下来，没有发生任何位置变动则说明此时已经达到有序，可以终止排序了
     * @return
     */
    @Override
    public T[] sort() {
        int length=array.length;
        int change=1;
        for (int i = 0; i < length-1 && change!=0; i++) {
            change=0;
            for (int j = 0; j <length-1-i; j++) {
                if(array[j].compareTo(array[j+1])>0){
                    T temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    change=1;
                }
            }
        }
        return array;
    }


}
