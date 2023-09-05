package com.scaler.bitwise;

public class ReverseBits {

    public static void main(String[] args) {
        ReverseBits rev = new ReverseBits();
        //System.out.println(rev.revBitsI(3));
        //System.out.println(rev.revBitsIV(3));
        System.out.println(rev.revBitsIII(3));
    }

    public long revBitsI(int A) {
        long ans = 0;
        for (int i = 0; i <= 31; i++) {
            if ((A & (1 << i)) > 0) {
                ans = (long) (ans + Math.pow(2, 31 - i));
            }
        }
        return ans;
    }

    // need to check, not working or overflow
    public long revBitsII(long A) {
        long ans = 0;
        for (int i = 0; i <= 31; i++) {
            if ((A & (1 << i)) > 0) {
                ans = ans | (1 << 31 - i);
            }
        }
        return ans;
    }

    public long revBitsIII(long A) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((A & (1 << i)) > 0) {
                ans = ans | 1;
            }
            ans = ans << 1;
        }
        return ans;
    }

    public long revBitsIV(long A) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            if ((A & (1 << i)) > 0)
                rev = rev | 1;
        }
        return rev;
    }
}
