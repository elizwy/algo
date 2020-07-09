package com.zwy.leetcode.easy;

import com.alibaba.fastjson.JSON;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[nums.length];
        for(int i=0,k=0,j=n;i<n;i++){
            nums2[k++]=nums[i];
            nums2[k++]=nums[j++];
        }
        return nums2;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9,11,13,15,17,19};
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] shuffle = shuffleTheArray.shuffle(nums, 5);
        System.out.println(JSON.toJSONString(shuffle));
    }
}
