package com.mytech.lambda;

import java.util.Arrays;

public class EvenOrOddNumberByBitwiseOperator {

    public static void main(String[] args) {
//        int n = 6;
        for(int n=0;n<=100;n++) {

            if (n < 0) {
                System.out.println(n + " Invalid Number");
            } else if (n == 0) {
                System.out.println(n + " Number is odd");
            } else if ((n & 1) == 0) {
                System.out.println(n + " Number is Even");
            } else {
                System.out.println(n + " Number is Odd");
            }
        }


    }

}
