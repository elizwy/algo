package com.zwy.muke.sort;

public interface Sort<T> {
    /**
     * 排序
     */
    T[] sort(T[] array);

    /**
     * 检验排序结果
     */
    void checkSort(T[] array);
}
