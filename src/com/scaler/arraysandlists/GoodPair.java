package com.scaler.arraysandlists;

import java.util.ArrayList;

public class GoodPair {

    public static void main(String[] args) {
        GoodPair goodPair = new GoodPair();
        ArrayList<Integer> inputList = new ArrayList<>();

        inputList.add(5);
        inputList.add(1);
        inputList.add(6);
        inputList.add(1);
        inputList.add(7);

        int K = 9;

        int result = goodPair.solve(inputList, K);
        System.out.println(result);

    }

    public int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(A.get(i) + A.get(j) == B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
