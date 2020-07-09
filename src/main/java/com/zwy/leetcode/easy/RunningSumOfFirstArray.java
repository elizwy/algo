package com.zwy.leetcode.easy;

import com.alibaba.fastjson.JSON;

public class RunningSumOfFirstArray {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        RunningSumOfFirstArray array = new RunningSumOfFirstArray();
        array.runningSum(nums);
        System.out.println(JSON.toJSONString(nums));
    }
}
