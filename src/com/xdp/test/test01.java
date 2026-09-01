package com.xdp.test;

public class test01 {
    public static void main(String[] args) {
//        取整操作
        int i = (int)(Math.random() * 6) + 1;
        int j = (int)(Math.random() * 6) + 1;
        int k = (int)(Math.random() * 6) + 1;
        if ((i + j + k) > 10) {
            System.out.println("小于10");
        } else {
            System.out.println("大于10");
        }
//        System.out.println(rand);
    }
}
