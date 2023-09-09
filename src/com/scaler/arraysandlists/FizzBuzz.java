package com.scaler.arraysandlists;

import java.util.ArrayList;

public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<String> result = fizzBuzz.formFizzBuzz(10);

        for (String str : result) {
            System.out.print(str + " ");
        }

    }

    public ArrayList<String> formFizzBuzz(int N) {
        ArrayList<String> resultString = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultString.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultString.add("Fizz");
            } else if (i % 5 == 0) {
                resultString.add("Buzz");
            } else {
                resultString.add(String.valueOf(i));
            }
        }
        return resultString;
    }
}
