package com.scaler.bitwise;

public class CountSetBitsI {
    public static void main(String[] args) {
        CountSetBitsI setBitsI =new CountSetBitsI();
        int result = setBitsI.countsetBits(73);
        System.out.println(result);
    }

    public int countsetBits(int A) {
        int total_count = 0;
        while (A != 0) {
            A = A & (A - 1);
            total_count++;
        }
        return total_count;
    }
}
