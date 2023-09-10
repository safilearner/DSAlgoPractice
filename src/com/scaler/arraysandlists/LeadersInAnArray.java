package com.scaler.arraysandlists;

import java.util.ArrayList;

public class LeadersInAnArray {

    public static void main(String[] args) {
        LeadersInAnArray leaders = new LeadersInAnArray();

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(16);
        aList.add(17);
        aList.add(4);
        aList.add(3);
        aList.add(5);
        aList.add(2);

        ArrayList<Integer> result = leaders.findLeaders(aList);
        for (int X : result) {
            System.out.print(X + " ");
        }

        System.out.println();

        ArrayList<Integer> resultI = leaders.findLeadersI(aList);
        for (int X : resultI) {
            System.out.print(X + " ");
        }
    }

    public ArrayList<Integer> findLeaders(ArrayList<Integer> A) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int N = A.size();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A.get(i) < A.get(j)) {
                    break;
                }
                if (j == N - 1) {
                    resultList.add(A.get(i));
                }
            }
        }
        resultList.add(A.get(N - 1));
        return resultList;
    }

    public ArrayList<Integer> findLeadersI(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int N = A.size();
        for (int i = 0; i < N; i++) {
            int j;
            for (j = i + 1; j < N; j++) {
                if (A.get(i) < A.get(j)) {
                    break;
                }
            }
            if (j == N) {
                result.add(A.get(i));
            }
        }
        return result;
    }
}
