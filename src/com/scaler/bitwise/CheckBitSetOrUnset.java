package com.scaler.bitwise;

public class CheckBitSetOrUnset {

    public static void main(String[] args) {
        CheckBitSetOrUnset checkBit = new CheckBitSetOrUnset();

        boolean setBit = checkBit.checkSetBit(11,1);
        System.out.println(setBit);

        boolean setBitI = checkBit.checkSetBit(11,2);
        System.out.println(setBitI);

    }

    public boolean checkSetBit(int A, int i) {
        if (((A >> i) & 1) == 1) {
            return true;
        }
        return false;
    }
}
