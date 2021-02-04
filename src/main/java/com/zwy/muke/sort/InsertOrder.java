package com.zwy.muke.sort;

import com.zwy.muke.sort.Helper.SortHelper;

/**
 * 采用假设：第n个元素往前n-1个有序数组找到合适的位置； 类似扑克牌整理
 * 时间复杂度：O(n) - O(n^2)
 * 空间复杂度
 * 缺点：不稳定，如果假设失败，将完全退化为O(n^2)级别 ； 元素位置频繁移动
 * @param <T>
 */
public class InsertOrder <T extends Comparable> extends AbstractSort<T>{
    public InsertOrder(T[] array) {
        super(array);
    }

    @Override
    public T[] sort() {
        for(int now=1;now<array.length;now++){
            for(int j=now-1;j>=0;j--){

                if(array[now].compareTo(array[j])>=0){
                    adjust(array,j+1,now);
                    break;
                }
                if(j==0){
                    adjust(array,j,now);
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
        while (endIndex>startIndex){
            array[endIndex]=array[endIndex-1];
            endIndex--;
        }
        array[startIndex]=tempValue;
    }

    public static void main(String[] args) {
        Integer[] array = SortHelper.generateArray(10000, 20, 50);
        InsertOrder<Integer> sort = new InsertOrder<>(array);
        SortHelper.testSort(sort,true);
//        sort.echo();
    }
}
