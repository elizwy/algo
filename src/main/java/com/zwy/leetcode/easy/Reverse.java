package com.zwy.leetcode.easy;

public class Reverse {
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            result=(result*10)+(x%10);
            x=x/10;
        }
        return result;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int result = reverse.reverse(12345);
        System.out.println(result);
    }
}
