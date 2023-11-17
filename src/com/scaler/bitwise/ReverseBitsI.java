package com.scaler.bitwise;

public class ReverseBitsI {

    public static void main(String[] args) {
        ReverseBitsI reverse = new ReverseBitsI();
        long output = reverse.reverseNum(3);
        System.out.println(output);

    }


    public long reverseNum(int X) {
        long result = 0;
        for (int i = 0; i <= 31; i++) {
            if (((X >> i) & 1) == 1) {
                result = (long) (result + Math.pow(2, 31-i));
            }
        }
        return result;
    }
}
