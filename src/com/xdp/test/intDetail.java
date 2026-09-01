package com.xdp.test;

public class intDetail {
    public static void main(String[] arges) {
//        int 只有4个字节 int n2 = 1L 8个字节
        int n1 = 1;
        long n2 = 1L;
//        浮点数 小数类型
        double n9 = 2.7;
        double n10 = 8.1 / 3;
        System.out.println("输出的值是----"+n10);
        System.out.println(Math.abs(n9 - n10));
        if (Math.abs(n9 - n10) < 0.001) {
            System.out.println("差值非常小可以忽略时 两个值相等 000");
        }
    }
}
