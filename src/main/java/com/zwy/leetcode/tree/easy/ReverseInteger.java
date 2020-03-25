package com.zwy.leetcode.tree.easy;

/**
 * 考虑溢出情况
 */
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(120));
        System.out.println(reverseInteger.reverse(1234));
        System.out.println(reverseInteger.reverse(-100));
        System.out.println(reverseInteger.reverse(-1120));
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 & pop > 7)) {
                return 0;
            } ;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 & pop < -8)) {
                return 0;
            } ;
            rev=rev*10+pop;
            x/=10;
        }
        return rev;
    }
}
