package com.mytech.lambda;
class A
{
    synchronized void m1()
    {
        System.out.println("In m1 A");
    }
    synchronized void m2()
    {
        System.out.println("In m2 A");
    }
}


public class TestA{
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}