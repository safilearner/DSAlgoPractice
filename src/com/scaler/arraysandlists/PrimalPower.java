package com.scaler.arraysandlists;

import java.util.ArrayList;

public class PrimalPower {

    public static void main(String[] args) {
        PrimalPower primal = new PrimalPower();
        int[] inputArr = {97, 43, 29, 11, 100, 47, 76, 83, 37, 19, 17, 19, 71, 0, 1, -82, 2, -83, 37, 13, 5, 97, 17, 30, 31, 48, 2, 19, 31, 91, 19, 2, 5, 89, 2, 67, 31, 47, 43, 31, 5, 17, 83, 11, 47, 73, 19, 3, 3, 19, 59, 91, 67, 7, 43, 4, 3, 51, 52, 23, 3, 37, 53, 89, 9, 41, 19, 61, 7, 5, 53, 59, 19, 11, 79, 37, 31, 37, 73, 82, 41, 2, 13, 8, 2, 36, 19, 58, 17, 17, 59, 59, 37, 11, 13, 37, 47, 83, 31, 3};
        ArrayList<Integer> aList = new ArrayList<>();
        for (int x : inputArr) {
            aList.add(x);
        }

        System.out.println("size : " + aList.size());

        int count = primal.countOfPrimeNumbers(aList);
        System.out.println(count);

    }

    public int countOfPrimeNumbers(ArrayList<Integer> A) {
        int N = A.size();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (checkPrime(A.get(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean checkPrime(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrime(ArrayList<Integer> A) {
        int count = 0;
        int N = A.size();
        for (int i = 0; i < N; i++) {
            if (A.get(i) > 1) {
                boolean checkPrime = true;

                for (int j = 2; j * j <= A.get(i); j++) {
                    if (A.get(i) % j == 0) {
                        checkPrime = false;
                    }
                }
                if (checkPrime) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
