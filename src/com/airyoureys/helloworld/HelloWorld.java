package com.airyoureys.helloworld;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 这是单行注释

/*
这是多行注释
 */

/**
 * 这是文档注释
 */
public class HelloWorld {
    /*public static void main(String[] args) {
        System.out.println("hello world!!");
        List<Integer> list = new ArrayList<>();
        list.add(, );
    }*/

    public static void main(String[] args) {
        System.out.println("hello world"); // sout
        System.out.println("args = [" + args + "]"); // soutp

        int num = 12;
        System.out.println("num = " + num); // soutv
        System.out.println(num); // num.sout
        System.out.println("HelloWorld.main"); // soutm

        for (int i = 0; i < 10; i++) { // fori

        }

        for (String arg : args) { // iter

        }

        List<String> list = new ArrayList<>();
        for (String s : list) { // list.for

        }

        for (int i = 0; i < list.size(); i++) { // list.fori

        }

        for (int i = list.size() - 1; i >= 0; i--) { // list.forr
            
        }
    }

    public void method1(){
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
    }

    public void method2(){
        Date date = new Date();
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
    }

    public void testAdd(){
        System.out.println("hello world");
    }

    public void test(){

    }


    
}
