package com.zwy.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *  1 2 3
 *  4 5 6
 *  9 8 9
 *  |(1+5+9)-(3+5+9)|=2
 */
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int n=arr.size();
        int result=0;
        for(int i=0;i<n;i++){
            int left=arr.get(i).get(i);
            int right=arr.get(n-i-1).get(i);
            result+=(left-right);
        }
        return Math.abs(result);
    }

    public static void main(String[] args) {
        List<List<Integer>> testCase=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(4);
        List<Integer> list2=new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);
        testCase.add(list1);
        testCase.add(list2);
        testCase.add(list3);
        System.out.println(diagonalDifference(testCase));
    }
}
