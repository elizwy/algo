package com.zwy.leetcode.easy;

import java.util.Map;

public class RomanToInt {
    Map<Character,Integer> map=Map.of('I',1,'V',5,'X',10,'M', 1000, 'D', 500, 'C', 100, 'L', 50);

    public int romToInt(String s){
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = map.get(s.charAt(i));
            sum += num * 4 >= sum ? num : -num;
        }

        return sum;
    }
}
