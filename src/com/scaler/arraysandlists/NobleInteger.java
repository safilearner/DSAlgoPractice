package com.scaler.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger {

    public static void main(String[] args) {
        NobleInteger noble = new NobleInteger();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(-1);
        input.add(-2);
        input.add(-2);
        input.add(-4);
        input.add(0);

        int result = noble.checkP(input);
        System.out.println(result);

        ArrayList<Integer> input1 = new ArrayList<>();
        int[] inputArr = {-2, 8, 8, 6, -2, 3, -2, -7, 3, 3, -2, 0, 4, -3, -4, -2, -1, -10, -4, -2, 7, -1, 0, -7, 3, -7, 7, 3, 2, -4, -5, 2, 6, 5, -2, 7, -1, 6, -10, 4, -9, -10, -6, -2, -3, 0, -2, 6, -8, 4, 7, 9, -7, 9, -8, -2, -7, -10, -9, -3, 8, 9, 1, 5, 4, 9, 2, 5, -3, -6, -1, -1, -6};
        for (int x : inputArr) {
            input1.add(x);
        }

        int result1 = noble.checkP(input1);
        System.out.println(result1);

        int result2 = noble.checkP(input1);
        System.out.println(result2);
    }

    public int checkP(ArrayList<Integer> A) {
        int N = A.size();
        Collections.sort(A);
        for (int i = 0; i < N - 1; i++) {
            if (A.get(i) == A.get(i + 1)) {
                continue;
            }
            if (A.get(i) == N - 1 - i) {
                return 1;
            }
        }
        // Edge case : We iterated till N-1 in the for loop. If the last value in the array is 0,
        // then the answer should be 1 because 0 elements greater than 0.
        if (A.get(N - 1) == 0) {
            return 1;
        }
        return -1;
    }

    // Alternate solution
    public int checkP1(ArrayList<Integer> A) {
        int N = A.size();
        Collections.sort(A);
        for (int i = 0; i < N; i++) {
            while (i + 1 < N && A.get(i) == A.get(i + 1)) {
                i++;
            }
            if (A.get(i) == N - 1 - i) {
                return 1;
            }
        }
        return -1;
    }
}
