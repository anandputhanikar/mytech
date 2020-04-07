package com.mytech.lambda;

import java.util.Arrays;

public class ArraysEqualsOrNot {

    public static void main(String[] args) {
        boolean result = false;
        char[][] abcd = {{'A', 'B'}, {'C', 'D'}}; char[][] efgh = {{'E', 'F'}, {'G', 'H'}};
        char[][] ABCD = {{'A', 'B'}, {'C', 'D'}};
        result = Arrays.equals(abcd, efgh);
        System.out.printf("Comparing two dimensional arrays %s and %s in Java, Equal? %s %n ",
                Arrays.deepToString(abcd), Arrays.deepToString(efgh), result);
        result = Arrays.deepEquals(abcd, ABCD);
        // using equals() will return false
        System.out.printf("Comparing unequal two dimensional char arrays %s and %s in Java, are they same? %s %n",
                Arrays.deepToString(abcd), Arrays.deepToString(ABCD), result);


        int[] primes = {5, 7, 11, 17, 19, 23, 29, 31, 37};
        System.out.println("Prime numbers : " + primes);
        System.out.println("Real prime numbers : " + Arrays.toString(primes)); //Ok



    }
}
