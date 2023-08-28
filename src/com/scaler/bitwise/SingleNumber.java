package com.scaler.bitwise;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public static void main(String[] args) {
        SingleNumber single = new SingleNumber();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(10);
        inputList.add(7);
        inputList.add(3);
        inputList.add(8);
        inputList.add(3);
        inputList.add(7);
        inputList.add(10);
        int result = single.singleNumber(inputList);
        System.out.println(result);

    }

    public int singleNumber(final List<Integer> aList) {
        int result = 0;
        int N = aList.size();
        for (int i = 0; i < N; i++) {
            result = result ^ aList.get(i);
        }
        return result;
    }
}
