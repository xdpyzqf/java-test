package com.xdp.test;

import java.util.Map;
import java.util.HashMap;

public class jicheng {
    public static void main(String[] args) {
        final  double PI = 3.14;
        int r = 4;
        final double MAX_SPEED = 120;
        double area = PI * r * r;
        double circle = 2*PI *r;
        System.out.println(area);
        System.out.println(circle);

//        System.out.println("我要在这做继承");
//
//        // 创建Dog对象
//        Dog dog = new Dog();
//        String[] sounds = {"汪汪汪", "嗷嗷嗷"};
//        // 调用方法 - 直接传字符串
//        dog.wangwang(sounds);
//        Map<String, String> person2 = new HashMap<>();
//        person2.put("name", "11");
//        person2.put("age", "22");
//        dog.test(person2);
    }
}

class Dog extends jicheng {
    // 修正：参数类型从 String[] 改为 String
    public void wangwang( String[] srtList) {
        for (int i = 0; i < srtList.length; i++) {
            System.out.println("第" + (i+1) + "声：" + srtList[i]);
        }
    }
    public void test(Map<String, String> person2) {
//        System.out.println("name: " + person2.get("name") + ", age: " + person2.get("age"));
        for (Map.Entry<String, String> entry : person2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}