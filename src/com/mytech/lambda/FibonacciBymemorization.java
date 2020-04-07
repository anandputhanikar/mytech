package com.mytech.lambda;

import java.util.HashMap;
import java.util.Scanner;

public class FibonacciBymemorization {

    public static void main(String args[]) {
        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt(); System.out.println("Fibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){ System.out.print(improvedFibo(i) +" "); } }



    public static int improvedFibo(int number) {
        HashMap<Integer,Integer> cache = new HashMap<>();
        Integer fibonacci = cache.get(number);
        if (fibonacci != null) {
            return fibonacci;            //fibonacci number from cache
        }
        // fibonacci number not in cache, calculating it
        fibonacci = fibonacci2(number);
        // putting fibonacci number in cache for future request
        cache.put(number, fibonacci);

        System.out.println(cache);
        return fibonacci;
    }



    /* * Java program to calculate Fibonacci number using loop or Iteration. * @return Fibonacci number */
    public static int fibonacci2(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci; //Fibonacci number }


    }
}
