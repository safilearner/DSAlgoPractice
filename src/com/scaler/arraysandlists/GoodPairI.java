package com.scaler.arraysandlists;

import java.util.ArrayList;

public class GoodPairI {

    public static void main(String[] args) {
        GoodPairI goodPair = new GoodPairI();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(5);
        input.add(2);
        input.add(8);
        input.add(9);
        input.add(4);

        int output = goodPair.checkGoodPair(input, 4);
        System.out.println(output);
    }

    public int checkGoodPair(ArrayList<Integer> A, int B)
    {
        int N = A.size();
        for(int i =0;i<N;i++)
        {
            for(int j =i+1;j<N;j++)
            {
                if(A.get(i) + A.get(j) == B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
