import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        int[] wts = new int[n];

        for (int i = 0; i < val.length; i++) {
            val[i] = scn.nextInt();
        }

        for (int i = 0; i < wts.length; i++) {
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[] dp = new int[cap + 1];
        dp[0] = 0;
        for (int bagc = 1; bagc <= cap; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (wts[i] <= bagc) {
                    int rbagc = bagc - wts[i]; //remaining bag capacity
                    int rbagv = dp[rbagc]; // remaining bag value
                    int tbagv = rbagv + val[i]; // total bag value
                    if (tbagv > max) {
                        max = tbagv;
                    }
                }
            }
            dp[bagc] = max;
        }
        System.out.println(dp[cap]);

    }
}