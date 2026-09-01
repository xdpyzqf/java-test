package com.xdp.test;

public class test {
    public static void main(String[] arges) {
//        定义一个 int数据 类型是整型 名称a 值是1
//        int a = 1;
//        int b= 2;
//        b = 89;
//        System.out.println(a);
//        System.out.println(b);
        byte n1 = 10;
        short n2 = 10;
        int age = 20;
        String strNum = "100";
        double score = 88.9;
        char gender = '男';
        String name ="张三";
        System.out.println("输出的n值是------"+n1 + "---"+n2);
        System.out.println("输出的人员信息");
        System.out.println("输出的是 " + (age + score));
        System.out.println("输出的是 " + (age + score +  " " + name));
        System.out.println("输出的是age gender " + (age + gender));

    }
}
