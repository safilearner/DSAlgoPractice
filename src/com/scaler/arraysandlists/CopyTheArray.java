package com.scaler.arraysandlists;

import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {

    public static void main(String[] args) {
        CopyTheArray copyObj = new CopyTheArray();

        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);

        int B = 3;

        ArrayList<Integer> result = copyObj.solve(inputList, B);

        for (int x : result) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int N = A.size();
        for (int i = 0; i < N; i++) {
            resultList.add(A.get(i) + B);
        }
        return resultList;
    }
}
