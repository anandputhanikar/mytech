package com.mytech.lambda;

/**
 * ArmstrongNumber : Sum of cube root of each digit of given number is equal to the given value then given number is an armstrongNumber.
 * Eg: 153 = (1*1*1)+(5*5*5)+(3*3*3)
 */
public class ArmstrongNumber
{
    public static void main(String[] args) {
        int val = 153;
        int n = val;
        int sum=0;
int rev=0;
        while(n!=0){
            int rem = n % 10;
            rev = rev * 10+rem;
            n = n/10;
            sum = sum + (int) Math.pow(rem,3);

            System.out.println("digit = "+rem + " CubeRoot of digit = "+ (int) Math.pow(rem,3) + " Armstrong Number " +sum );

        }
        System.out.println( " Value " + val +" is Armstrong Number " + (sum==val?true:false) );

    }
}
