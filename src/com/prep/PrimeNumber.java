package com.prep;

public class PrimeNumber {
    public  static  void  main(String[] args)
    {
        PrimeNumber primeNumber = new PrimeNumber();
        int number = 10;
        System.out.println(primeNumber.isPrimeNumber(number));
        System.out.println(primeNumber.isPrimeNumberDivideByTwo(number));
        System.out.println(primeNumber.isPrimeNumberSquare(number));
        System.out.println(primeNumber.isPrimeNumberSquareRoot(number));

    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    private boolean isPrimeNumberDivideByTwo(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPrimeNumberSquare(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPrimeNumberSquareRoot(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
