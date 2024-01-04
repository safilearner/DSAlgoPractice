package com.scaler.revision;

import java.util.ArrayList;

public class MinMaxPicks {

    public static void main(String[] args) {
        MinMaxPicks minMaxPicks = new MinMaxPicks();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(5);
        A.add(17);
        A.add(100);
        A.add(1);
        int result = minMaxPicks.solve(A);
        System.out.println(result);
    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int odd_min = Integer.MAX_VALUE;
        int even_max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A.get(i) % 2 == 0) {
                if (even_max < A.get(i)) {
                    even_max = A.get(i);
                }
            } else {
                if (odd_min > A.get(i)) {
                    odd_min = A.get(i);
                }
            }
        }

        return even_max - odd_min;
    }
}
