package com.scaler.arraysandlists;

import java.util.ArrayList;

public class SumOfAllTheElements {

    public static void main(String[] args) {
        SumOfAllTheElements totalSum = new SumOfAllTheElements();
        int[] inputArr = {1, 2, 3, 4, 5};
        int result = totalSum.sum(inputArr);
        System.out.println(result);

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(5);

        int resultI = totalSum.sumAList(inputList);
        System.out.println(resultI);
    }

    public int sum(int[] A) {
        int total = 0;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            total += A[i];
        }
        return total;
    }

    public int sumAList(ArrayList<Integer> aList) {
        int total = 0;
        int N = aList.size();
        for (int i = 0; i < N; i++) {
            total += aList.get(i);
        }
        return total;
    }
}
