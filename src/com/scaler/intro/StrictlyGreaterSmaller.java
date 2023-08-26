package com.scaler.intro;

import java.util.ArrayList;

public class StrictlyGreaterSmaller {

    public static void main(String[] args) {
        StrictlyGreaterSmaller strictlyGreaterSmaller = new StrictlyGreaterSmaller();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        inputList.add(4);

        int result = strictlyGreaterSmaller.solveStrictlyGreater(inputList);
        System.out.println(result);
    }

    public int solveStrictlyGreater(ArrayList<Integer> aList) {
        int N = aList.size();

        // edge case 1
        // If array size is one, we cannot find strictly greater or smaller, so 0
        if (N == 1) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // finding max and min
        for (int i = 0; i < N; i++) {
            if (max < aList.get(i)) {
                max = aList.get(i);
            }
            if (min > aList.get(i)) {
                min = aList.get(i);
            }
        }

        // edge case 2
        // if the min and max are equal, there will be no greater or smaller elements, return 0
        if (min == max) {
            return 0;
        }

        // total count of max and min
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (max == aList.get(i)) {
                count++;
            }
            if (min == aList.get(i)) {
                count++;
            }
        }

        return aList.size() - count;
    }
}
