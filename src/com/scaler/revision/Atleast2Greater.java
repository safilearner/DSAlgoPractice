package com.scaler.revision;

import java.util.ArrayList;

public class Atleast2Greater {

    public static void main(String[] args) {

        Atleast2Greater atl2 = new Atleast2Greater();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(2);
        input.add(4);
        input.add(8);
        input.add(6);

        ArrayList<Integer> result = atl2.solve(input);
        for (int X : result) {
            System.out.println(X);
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();

        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (first_max < A.get(i)) {
                second_max = first_max;
                first_max = A.get(i);
            } else if (second_max < A.get(i)) {
                second_max = A.get(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (A.get(i) != first_max && A.get(i) != second_max) {
                result.add(A.get(i));
            }
        }
        return result;
    }
}
