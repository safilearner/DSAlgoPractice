package com.scaler.intro;

import java.util.ArrayList;

public class AtleastTwoGreaterI {

    public static void main(String[] args) {

        AtleastTwoGreaterI atleastTwo = new AtleastTwoGreaterI();

        ArrayList<Integer> inputList1 = new ArrayList<>();
        inputList1.add(1);
        inputList1.add(2);
        inputList1.add(3);
        inputList1.add(4);
        inputList1.add(5);

        ArrayList<Integer> resultList1 = atleastTwo.solveTwoGreater(inputList1);
        for (int x : resultList1) {
            System.out.println(x);
        }

        System.out.println();

        ArrayList<Integer> inputList2 = new ArrayList<>();
        inputList2.add(5);
        inputList2.add(17);
        inputList2.add(10);

        ArrayList<Integer> resultList2 = atleastTwo.solveTwoGreater(inputList2);
        for (int x : resultList2) {
            System.out.println(x);
        }

    }


    public ArrayList<Integer> solveTwoGreater(ArrayList<Integer> aList) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int N = aList.size();
        // find first max and second max in a arraylist
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            if (aList.get(i) > firstMax) {
                secondMax = firstMax;
                firstMax = aList.get(i);
            } else if (aList.get(i) > secondMax) {
                secondMax = aList.get(i);
            }
        }
        // compare the list with max elements
        for (int i = 0; i < N; i++) {
            if (aList.get(i) != firstMax && aList.get(i) != secondMax) {
                resultList.add(aList.get(i));
            }
        }
        return resultList;
    }

}
