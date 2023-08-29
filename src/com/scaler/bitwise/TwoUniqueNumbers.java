package com.scaler.bitwise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TwoUniqueNumbers {

    public static void main(String[] args) {
        TwoUniqueNumbers uniqueNumbers = new TwoUniqueNumbers();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(12);
        inputList.add(14);
        inputList.add(18);
        inputList.add(3);
        inputList.add(10);
        inputList.add(11);
        inputList.add(17);
        inputList.add(12);
        inputList.add(14);
        inputList.add(18);
        inputList.add(3);
        inputList.add(10);

        ArrayList<Integer> result = uniqueNumbers.solve(inputList);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int N = A.size();
        int xorValue = 0;

        //finding XOR of all the elements
        for (int i = 0; i < N; i++) {
            xorValue = xorValue ^ A.get(i);
        }

        // check first set bit position, if the bit is set in the resultant value
        // that means unique numbers have different bit values at that position
        int pos = 0;
        for (int i = 0; i < 31; i++) {
            if (((xorValue >> i) & 1) == 1) {
                pos = i;
                break;
            }
        }

        // compare the elements in the arraylist with the found position to find the set and unset

        int set = 0;
        int unset = 0;
        for (int i = 0; i < N; i++) {
            if (((A.get(i) >> pos) & 1) == 1) {
                set = set ^ A.get(i);
            } else {
                unset = unset ^ A.get(i);
            }
        }
        resultList.add(set);
        resultList.add(unset);
        Collections.sort(resultList);

        return resultList;
    }
}
