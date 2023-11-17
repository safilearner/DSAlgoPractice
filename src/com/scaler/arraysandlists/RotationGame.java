package com.scaler.arraysandlists;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.nextLine();
        int B = sc.nextInt();

        sc.close();

        int start = 0;

        // Rotating towards the right or R -> L
        RotationGame rotationGame = new RotationGame();

        // Firstly reverse the entire array
        rotationGame.reverse(A, start, N);

        // If the rotating times is greater than array size,
        // use modulo op to find the number of rotation needed
        B = B % N;

        // Reverse the sub array from 0 -> B-1
        rotationGame.reverse(A, start, B);

        // Reverse the sub array from B -> N-1
        rotationGame.reverse(A, B, N);


        // Print the reversed array
        for (int k = 0; k < N; k++) {
            System.out.print(A[k] + " ");
        }
    }

    public void reverse(int[] inputArr, int start, int end) {
        int i = start;
        int j = end - 1;
        while (i < j) {
            int temp = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = temp;
            i++;
            j--;
        }
    }
}
