package com.zwy.muke.sort;

public abstract class AbstractSort<T extends Comparable> implements Sort<T>{
    T[] array;

    public AbstractSort(T[] array) {
        this.array = array;
    }

    @Override
    public void checkSort(T[] array) {
        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(array[i-1])<0){
                System.out.println("i:["+array[i]+"]i-1:["+array[i-1]+"]");
                throw new RuntimeException("无序数组");
            };
        }
    }

    protected void echo() {
        for (T element: array) {
            System.out.println(element);
        }
    }

    protected void swap(int left,int right){
        T tmp=array[left];
        array[left]=array[right];
        array[right]=tmp;
    }
}
