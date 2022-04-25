import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] val = new int[n];
        int[] wts = new int[n];

        for(int i=0; i<val.length; i++){
            val[i] = scn.nextInt();
        }

        for(int i=0; i<wts.length; i++){
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[][] dp = new int[n+1][cap+1];

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                //when i bats then there should be enough ball for his batting
                if(j>=wts[i-1]){
                    //balls remaining after his batting
                    int remCap = j - wts[i-1];
                    // if total runs scored he bats is greater than when he doesn't bats
                    if(dp[i-1][remCap] + val[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][remCap] + val[i-1];
                    }else{
                        // we will not let him bat
                         dp[i][j] = dp[i-1][j]; // when i doesn't bat 
                    }
                }else{
                    dp[i][j] = dp[i-1][j]; // when i doesn't bat 
                }
            }
        }

        System.out.println(dp[n][cap]);

    }
}
