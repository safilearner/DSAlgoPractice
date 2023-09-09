package com.scaler.arraysandlists;

import java.util.ArrayList;

public class TimeToEquality {

    public static void main(String[] args) {

        TimeToEquality timeToEqual = new TimeToEquality();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(4);
        inputList.add(1);
        inputList.add(3);
        inputList.add(2);

        int result = timeToEqual.solve(inputList);
        System.out.println(result);

    }

    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int N = A.size();

        // finding max in an array
        for (int i = 0; i < N; i++) {
            if (max < A.get(i)) {
                max = A.get(i);
            }
        }

        int result = 0;

        // find the difference between the max and other elements in the array
        // sum of difference is the time to equality
        for (int i = 0; i < N; i++) {
            if (A.get(i) < max) {
                result = result + (max - A.get(i));
            }
        }

        return result;
    }
}
