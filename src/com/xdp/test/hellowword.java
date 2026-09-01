package com.xdp.test;
//hellowword 是个 public 类 所以 文件命名必须与 public 类相同

//这里表示 hellowword 是一个类 是一个 public（公有） 的类
// hellowword {} 表示一个类的开始结束
// public static void main(String[] args) 表示一个主方法 （我们程序的入口）
// main {} 表示方法的开始 结束
// System.out.println 输出


public class hellowword {
//    我是第一个徐东平写的java hellow word
    public static void main(String[] args) {

        System.out.println("hellow word 你好世界");
        System.out.println("我是java \r 世界");
        dogs myDog = new dogs();
        myDog.barka();
//        triger myTriger = new triger();
//        myTriger.aaa();
    }
}

//其他类
class dogs {
//    public  static  void main(String[] args) {
//        System.out.println("你好 我是一个 牧羊犬");
//    }
    public void barka() {
        System.out.println("你好 我是一个 牧羊犬");
    }
}
class triger {
//    public  static  void main(String[] args) {
//        System.out.println("你好 我是一个 波斯猫");
//    }
    public void  aaa() {
        System.out.println("你好 我是一个 波斯猫");
    }
}