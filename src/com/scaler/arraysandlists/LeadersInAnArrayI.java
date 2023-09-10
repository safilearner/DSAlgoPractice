package com.scaler.arraysandlists;

public class LeadersInAnArrayI {

    public static void main(String[] args) {
        LeadersInAnArrayI leadersI = new LeadersInAnArrayI();
        int[] A = {16, 17, 4, 3, 5, 2};
        int[] B = leadersI.findLeadersI(A);
        for (int x : B) {
            System.out.print(x + " ");
        }

    }

    public int[] findLeadersI(int[] A) {
        int N = A.length;
        int[] ans = new int[N];

        int max_from_right = A[N - 1];
        int count = 0;
        ans[count++] = max_from_right;


        for (int i = N - 2; i >= 0; i--) {
            if (A[i] > max_from_right) {
                ans[count++] = A[i];
                max_from_right = A[i];
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = ans[i];
        }


        return result;
    }
}
