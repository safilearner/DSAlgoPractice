package com.scaler.intro;

public class PrimeNumbers {
    public static void main(String[] args) {

        PrimeNumbers primeObj = new PrimeNumbers();
        boolean isPrime = primeObj.checkPrime(19);
        System.out.println(isPrime);
        boolean isPrimeI = primeObj.checkPrimeI(8);
        System.out.println(isPrimeI);

    }

    public boolean checkPrime(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }

    public boolean checkPrimeI(int N) {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
