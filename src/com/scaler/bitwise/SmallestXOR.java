package com.scaler.bitwise;

public class SmallestXOR {

    public static void main(String[] args) {

        SmallestXOR small = new SmallestXOR();

        int result = small.findX(3, 3);
        System.out.println(result);

        int result2 = small.findX(15,2);
        System.out.println(result2);

    }

    public int findX(int A, int B) {
        int X = 0;

        // iterate from reverse to set the higher significant bit in X,
        // so that while doing XOR (A^X) minimum result is possible
        for (int i = 30; i >= 0; i--) {
            if (B == 0) {
                return X;
            }
            // check whether the bit is set in A
            if ((A & (1 << i)) > 0) {
                X = X | (1 << i);
                B--;
            }
        }


        for (int i = 0; i <= 30; i++) {
            if (B == 0) {
                return X;
            }
            // if B still has the value, then set the lower significant bits in X
            // so that the minimum value is possible
            // check whether the bit is unset in X
            if ((X & (1 << i)) == 0) {
                X = X | (1 << i);
                B--;
            }
        }
        return X;
    }
}
