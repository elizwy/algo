package com.zwy.leetcode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        char[] chars = String.valueOf(x).toCharArray();
        for(int i=0,j= chars.length-1;i<j;i++){
            if(chars[i]!=chars[j]){
                return false;
            }
            j--;
        }
        return true;
    }


    public boolean isPalindrome2(int x){
        if(x<0){
            return false;
        }
        int sum=0;
        if(x<10){
            return true;
        }
        while (sum<=x){
            sum=sum*10+x%10;
            x=x/10;
        }
        if(sum==x||sum/10==x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber number = new PalindromeNumber();

        System.out.println(number.isPalindrome2(10));

        System.out.println(number.isPalindrome2(-101));

        System.out.println(number.isPalindrome2(101));
    }
}
