// subset of any arrays of number is equal to 2 raise to the power of array length

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

        int tar = scn.nextInt();

        boolean[][] dp = new boolean[n + 1][tar + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) { // first element
                    dp[i][j] = true;

                } else if (i == 0) { // first row
                    dp[i][j] = false;

                } else if (j == 0) { // first col
                    dp[i][j] = true;

                } else {
                    // when element is not involved so it check its upper elememt
                    // if they can meet the target
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    } else {
                        // now element involves in the sum
                        int val = arr[i - 1]; // i-1 bcz our index of elements is 1 smaller to the actual index of dp
                                              // rows
                        if (j >= val) { // bcz for smaller j it cannot participate
                            if (dp[i - 1][j - val] == true) {
                                dp[i][j] = true;
                            }

                        }

                    }

                }
            }
        }

        System.out.println(dp[arr.length][tar]);

    }
}