package com.scaler.bitwise;

public class AddTwoBinaryStrings {

    public static void main(String[] args) {
        AddTwoBinaryStrings add2 = new AddTwoBinaryStrings();
        System.out.println(add2.addBinary("1101", "111"));
        System.out.println(add2.addBinaryII("1101", "111"));
    }

    public String addBinary(String A, String B) {
        int lengthOfA = A.length() - 1;
        int lengthOfB = B.length() - 1;
        int carry = 0;
        String ans = "";
        while (lengthOfA >= 0 || lengthOfB >= 0 || carry == 1) {
            int sum = 0;
            int digit = 0;
            if (lengthOfA >= 0) {
                sum = sum + A.charAt(lengthOfA) - '0';
                lengthOfA--;
            }
            if (lengthOfB >= 0) {
                sum = sum + B.charAt(lengthOfB) - '0';
                lengthOfB--;
            }
            sum = sum + carry;
            digit = sum % 2;
            carry = sum / 2;
            ans = digit + ans;
        }
        return ans;
    }

    public String addBinaryII(String A, String B) {
        String ans = "";
        int carry = 0;
        int digit = 0;

        int aLen = A.length();
        int bLen = B.length();
        int maxLen = Math.max(aLen, bLen);
        for (int i = 0; i < maxLen; i++) {
            int a = (i < aLen) ? A.charAt(aLen - 1 - i) - '0' : 0;
            int b = (i < bLen) ? B.charAt(bLen - 1 - i) - '0' : 0;
            int sum = a + b + carry;
            digit = sum % 2;
            carry = sum / 2;
            ans = digit + ans;
        }
        return (carry > 0) ? "1" + ans : ans;
    }
}
