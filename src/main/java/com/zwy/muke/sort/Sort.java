package com.zwy.muke.sort;

public interface Sort<T> {
    /**
     * 排序
     */
    void sort(T[] array);

    /**
     * 检验排序结果
     */
    void checkSort();
}
