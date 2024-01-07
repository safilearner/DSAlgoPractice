package com.scaler.revision;

public class Add2BinaryStringsI {

    public static void main(String[] args) {
        Add2BinaryStringsI add2 = new Add2BinaryStringsI();
        String A = "1010110111001101101000";
        String B = "1000011011000000111100110";
        // String A  ="1101";
        // String B = "101";
        // 1001110001111010101001110
        String result = add2.add2Binary(A, B);
        System.out.println(result);
        String result1 = add2.add2(A, B);
        System.out.println(result1);
    }

    public String add2Binary(String A, String B) {
        int aLen = A.length() - 1;
        int bLen = B.length() - 1;
        int carry = 0;
        String result = "";

        while (aLen >= 0 || bLen >= 0 || carry > 0) {
            int digit = 0;

            if (aLen >= 0) {
                digit = digit + A.charAt(aLen) - '0';
                aLen--;
            }

            if (bLen >= 0) {
                digit = digit + B.charAt(bLen) - '0';
                bLen--;
            }

            digit = digit + carry;
            int sum = digit % 2;
            result = sum + result;
            carry = digit / 2;

        }
        return result;
    }

    public String add2(String A, String B) {
        int aLen = A.length();
        int bLen = B.length();
        int maxLen = Math.max(aLen, bLen);
        int carry = 0;
        String result = "";
        for (int i = 0; i < maxLen; i++) {
            int X = i < aLen ? A.charAt(aLen - 1 - i) - '0' : 0;
            int Y = i < bLen ? B.charAt(bLen - 1 - i) - '0' : 0;
            int digit = X + Y + carry;
            int sum = digit % 2;
            carry = digit / 2;
            result = sum + result;

        }
        return carry > 0 ? "1" + result : result;
    }
}
