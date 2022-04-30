import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] dp = new int[n+1];
        dp[1] = 1; // tiling 2*1 area
        dp[2] = 2; // tiling 2*2 area

        for(int i=3; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2]; // tiling 2*i area
        }

        System.out.println(dp[n]);

    }
}