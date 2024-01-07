package com.scaler.revision;


import java.util.ArrayList;
import java.util.List;

public class SingleNumberI {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(3);
        input.add(5);
        input.add(8);
        input.add(5);
        input.add(3);
        input.add(2);

        SingleNumberI single = new SingleNumberI();
        int result = single.findSingleNumber(input);
        System.out.println(result);
    }

    public int findSingleNumber(final List<Integer> A) {
        int N = A.size();
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = result ^ A.get(i);
        }
        return result;
    }
}
