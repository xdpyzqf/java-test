package com.xdp.test;
import java.util.Scanner;
public class testScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String useName = sc.nextLine();
        System.out.println("用户名："+useName);
        System.out.println();

    }
}
