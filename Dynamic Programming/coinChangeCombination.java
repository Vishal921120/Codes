import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int amt = scn.nextInt();

        int[] dp = new int[amt + 1];
        dp[0] = 1; // paying 0 has one way i.e not pay anything

        // looping first on array will ensure that we only get combinations not
        // permutations
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] += dp[j - arr[i]];
            }

        }

        System.out.println(dp[amt]);

    }
}

