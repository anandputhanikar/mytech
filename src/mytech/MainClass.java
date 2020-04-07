package mytech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    static volatile int a=20;
    public static void main(String[] args){

        List<Integer> intList = new ArrayList<>();
        intList.addAll(Arrays.asList(new Integer[]{2,4,5,3,1,2}));
        System.out.println(intList);
        System.out.println(intList.remove(new Integer(1)));
        intList.add(2,1);
        System.out.println(intList);


    }

}

class Parent {

    protected  static void print() {

        System.out.println("I am Parent");

    }

}

class Child extends Parent {
    public static void print(){
        System.out.println("I am child");
    }

}