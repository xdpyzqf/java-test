package com.xdp.test;

public class changeChar {
    public static void main(String[] args) {
//        对齐
        System.out.println("书名\t地址\t 姓名\n三国\t定军山\t麻袋");
        System.out.println("三国\t常山\t 赵子龙");
//        换行
        System.out.println("西游记\n孙悟空");
//        \ 第一个是转义 \ 第二个才是输出
        System.out.println("水浒传\\\\林冲");
//
        System.out.println("宋江说:\"兄弟们\"");
        System.out.println("宋江说:\'代码撸起来\'");
//        \r前面的不会出现
        System.out.println("林冲说\r撸起来");
//        直接换行
        System.out.println("武松说:\r\n嫂嫂");
    }
}
