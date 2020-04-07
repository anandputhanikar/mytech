package com.mytech.lambda;

public class Parent {
    Parent(){
        System.out.println("Parent constructor");
    }

    static void m1(){
        System.out.println("Parent constructor with void");
    }


}


class Child extends Parent{
    static void m1(){
        System.out.println("overridden Parent constructor with void");
    }
}

