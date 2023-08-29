package com.scaler.bitwise;

public class CountSetBitsII {

    public static void main(String[] args) {
        CountSetBitsII countSetBitsII = new CountSetBitsII();
        int result = countSetBitsII.countSetBits(15);
        int result2 = countSetBitsII.countSetBitsLS(15);
        System.out.println(result);
        System.out.println(result2);
    }

    // count set bits using right shift
    public int countSetBits(int A) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if (((A >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }

    // count set bits using left shift
    public int countSetBitsLS(int A) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ((A & (1 << i)) > 0) {
                count++;
            }
        }
        return count;
    }
}
