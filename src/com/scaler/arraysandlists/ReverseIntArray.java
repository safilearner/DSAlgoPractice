package com.scaler.arraysandlists;

import java.util.ArrayList;

public class ReverseIntArray {

    public static void main(String[] args) {

        ReverseIntArray rev = new ReverseIntArray();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        ArrayList<Integer> output;
        output = rev.revArrayI(input);
        for (int x : output) {
            System.out.print(x + " ");
        }

        System.out.println();

        ArrayList<Integer> inputI = new ArrayList<>();
        inputI.add(1);
        inputI.add(2);
        inputI.add(3);
        inputI.add(4);
        inputI.add(5);

        ArrayList<Integer> outputI = rev.revArrayII(inputI);
        for (int x : outputI) {
            System.out.print(x + " ");
        }


        System.out.println();

        ArrayList<Integer> inputII = new ArrayList<>();
        inputII.add(1);
        inputII.add(2);
        inputII.add(3);
        inputII.add(4);
        inputII.add(5);

        ArrayList<Integer> outputII = rev.revArrayIII(inputII);
        for (int x : outputII) {
            System.out.print(x + " ");
        }

        System.out.println();

        ArrayList<Integer> inputIII = new ArrayList<>();
        inputIII.add(1);
        inputIII.add(2);
        inputIII.add(3);
        inputIII.add(4);
        inputIII.add(5);

        ArrayList<Integer> outputIII = rev.revArrayIV(inputIII);
        for (int x : outputIII) {
            System.out.print(x + " ");
        }

    }

    // reverse the array with while loop using temp variable
    public ArrayList<Integer> revArrayI(final ArrayList<Integer> aList) {
        int N = aList.size();
        int i = 0;
        int j = N - 1;
        int temp;
        while (i < j) {
            temp = aList.get(i);
            aList.set(i, aList.get(j));
            aList.set(j, temp);
            i++;
            j--;
        }
        return aList;
    }

    // reverse the array with while loop using addition and subtraction
    public ArrayList<Integer> revArrayII(ArrayList<Integer> aList) {
        int N = aList.size();
        int i = 0;
        int j = N - 1;
        while (i < j) {
            aList.set(i, aList.get(i) + aList.get(j));
            aList.set(j, aList.get(i) - aList.get(j));
            aList.set(i, aList.get(i) - aList.get(j));
            i++;
            j--;
        }

        return aList;
    }

    // reverse the array with while loop using XOR
    public ArrayList<Integer> revArrayIII(ArrayList<Integer> aList) {
        int N = aList.size();
        int i = 0;
        int j = N - 1;
        while (i < j) {
            aList.set(i, aList.get(i) ^ aList.get(j));
            aList.set(j, aList.get(i) ^ aList.get(j));
            aList.set(i, aList.get(i) ^ aList.get(j));
            i++;
            j--;
        }

        return aList;
    }

    // reverse using for loop
    public ArrayList<Integer> revArrayIV(ArrayList<Integer> A) {
        int N = A.size();
        int temp;
        for (int i = 0; i <= N / 2; i++) {
            temp = A.get(i);
            A.set(i, A.get(N - 1 - i));
            A.set(N - 1 - i, temp);
        }
        return A;
    }
}
