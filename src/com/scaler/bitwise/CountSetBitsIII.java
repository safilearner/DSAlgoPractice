package com.scaler.bitwise;

public class CountSetBitsIII {

    public static void main(String[] args) {

        CountSetBitsIII count = new CountSetBitsIII();
        int result = count.noOfSetBits(10);
        System.out.println(result);

    }

    public int noOfSetBits(int A) {
        int count = 0;
        while (A > 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A = A >> 1;
        }
        return count;
    }
}
