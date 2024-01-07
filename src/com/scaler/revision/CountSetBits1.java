package com.scaler.revision;

public class CountSetBits1 {

    public static void main(String[] args) {
        CountSetBits1 countBits = new CountSetBits1();
        int A = 15;
        int result = countBits.countSetBits(15);
        System.out.println(result);
    }

    public int countSetBits(int A) {
        int count = 0;
        while (A > 0) {
            count++;
            A = A & (A - 1);
        }
        return count;
    }
}
