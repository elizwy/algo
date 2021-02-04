package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

/**
 * 采用假设：第n个元素往前n-1个有序数组找到合适的位置； 类似扑克牌整理
 * 时间复杂度：O(n) - O(n^2)
 * 空间复杂度
 * 缺点：不稳定，如果假设失败，将完全退化为O(n^2)级别 ； 元素位置频繁移动
 * @param <T>
 */
public class InsertOrder <T extends Comparable> implements Sort<T> {
    @Override
    public T[] sort(T[] array) {
        for(int i=1;i<array.length;i++){
            for(int j=i-1;j>=0;j--){
                if(array[i].compareTo(array[j])<=0){
                    adjust(array,j+1,i);
                }
            }
        }
       return array;
    }

    private void adjust(T[] array, int startIndex, int endIndex) {
        if(startIndex==endIndex){
            return;
        }
        T tempValue=array[endIndex];
        for(int l=endIndex-1;l>=startIndex;l--){
            array[l+1]=array[l];
        }
        array[startIndex]=tempValue;
    }

    @Override
    public void checkSort(T[] array) {

    }

    public static void main(String[] args) {
        Integer[] array = SortHelper.generateArray(10, 20, 50);
        InsertOrder<Integer> sort = new InsertOrder<>();
        SortHelper.testSort(sort,array);
    }
}
