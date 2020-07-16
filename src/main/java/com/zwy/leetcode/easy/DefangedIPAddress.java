package com.zwy.leetcode.easy;

public class DefangedIPAddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        DefangedIPAddress defangedIPAddress = new DefangedIPAddress();
        System.out.println(defangedIPAddress.defangIPaddr("192.168.152.200"));

    }
}
