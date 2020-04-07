package com.mytech.lambda;

interface  Z{
    void m1();
}
public class Test {


    static void main(int a){
        System.out.println("overridden main here");
    }
    public static void main(String[] args) {
    Child obj = new Child();
    obj.m1();
    Test t= new Test();
    t.main(10);

    String str = "akutbc";
    String rev = "";
    rev = rev + str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
        System.out.println(rev);

    }
}
