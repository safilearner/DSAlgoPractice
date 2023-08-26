package com.scaler.intro;


import java.util.ArrayList;

public class MinimumPicks {

    public static void main(String[] args) {
        MinimumPicks minPicks = new MinimumPicks();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(4);
        inputList.add(10);
        inputList.add(1);
        inputList.add(3);

        int result = minPicks.solve(inputList);
        System.out.println(result);

    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int even_max = Integer.MIN_VALUE;
        int odd_min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            // even number check
            if (A.get(i) % 2 == 0) {
                if (even_max < A.get(i)) {
                    even_max = A.get(i);
                }
            }
            // odd number check
            if (A.get(i) % 2 != 0) {
                if (odd_min > A.get(i)) {
                    odd_min = A.get(i);
                }
            }
        }
        return even_max - odd_min;
    }
}
