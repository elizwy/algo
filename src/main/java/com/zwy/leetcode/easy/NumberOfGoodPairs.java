package com.zwy.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int num:nums){
            count+=map.getOrDefault(num,0);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
}
