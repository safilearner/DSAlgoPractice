package com.scaler.intro;

public class AtleastTwoGreater {

    public static void main(String[] args) {

        AtleastTwoGreater atleast2 = new AtleastTwoGreater();
        int[] input1 = {1, 2, 3, 4, 5};
        int[] result1 = atleast2.findAtleastTwoGreater(input1);
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

        System.out.println();

        int[] input2 = {5, 17, 10};
        int[] result2 = atleast2.findAtleastTwoGreater(input2);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }

    }

    public int[] findAtleastTwoGreater(int[] A) {
        int[] result = new int[A.length - 2];
        int firstGreater = Integer.MIN_VALUE;
        int secondGreater = Integer.MIN_VALUE;
        int N = A.length;
        for (int i = 0; i < N; i++) {
            if (A[i] > firstGreater) {
                secondGreater = firstGreater;
                firstGreater = A[i];
            } else if (A[i] > secondGreater) {
                secondGreater = A[i];
            }
        }

        int j = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < firstGreater && A[i] < secondGreater) {
                result[j] = A[i];
                j++;
            }
        }

        return result;
    }
}
