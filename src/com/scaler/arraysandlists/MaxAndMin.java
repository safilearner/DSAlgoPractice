package com.scaler.arraysandlists;

import java.util.ArrayList;

public class MaxAndMin {
    public static void main(String[] args) {
        MaxAndMin maxMinObj = new MaxAndMin();
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(5);
        aList.add(7);
        aList.add(1);
        aList.add(8);
        aList.add(2);

        int maxMinSum = maxMinObj.solve(aList);
        System.out.println(maxMinSum);

    }

    public int solve(ArrayList<Integer> A) {
        int N = A.size();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
            if (min > A.get(i)) {
                min = A.get(i);
            }
        }
        return max + min;
    }
}
