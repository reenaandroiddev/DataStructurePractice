package com.prep.recursion;

public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println("Iterative Way :"+interativeFactorial(10));
        System.out.println("Recursive Way :"+recursiveFactorial(10));

    }


    // Make use of stack to keep the track of previous factorials
    //-------Stack---------
    //recursiveFactorial(1)
    //recursiveFactorial(2)
    //recursiveFactorial(3)
    public static int recursiveFactorial(int num)
    {
        if (num==0) {
            return 1;
        }
        return num* recursiveFactorial(num-1);
    }
    public static int interativeFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
