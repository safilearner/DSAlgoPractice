package com.scaler.revision;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StrictSmallGreat {

    public static void main(String[] args) {

        int[] input = new int[5];
        input[0] = 5;
        input[1] = 3;
        input[2] = 4;
        input[3] = 2;
        input[4] = 8;

        ArrayList<Integer> inputList = new ArrayList<>();
        for (int x : input) {
            inputList.add(x);
        }

        StrictSmallGreat smallGreat = new StrictSmallGreat();
        int result = smallGreat.findElements(inputList);
        System.out.println(result);

    }


    public int findElements(ArrayList<Integer> aList) {
        int N = aList.size();

        // Edge Case 1
        // If the size of the input is 1, then there is no greater and lesser numbers
        if (N == 1) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // find max and min
        for (int i = 0; i < N; i++) {
            if (max < aList.get(i)) {
                max = aList.get(i);
            }

            if (min > aList.get(i)) {
                min = aList.get(i);
            }
        }

        // Edge Case 2
        // If max and min are same, then there will be no greater or lesser elements than min and max
        // If the input contains same element
        if (max == min) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (max == aList.get(i)) {
                count++;
            }
            if (min == aList.get(i)) {
                count++;
            }
        }

        return N - count;
    }
}
