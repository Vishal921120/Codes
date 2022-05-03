import java.io.*;
import java.util.*;

public class Main {
        
    public static long partitionKSubset(int n, int k) {
        // write your code here

        long[][] dp  = new long[k+1][n+1];

        for(int teams =0 ; teams <= k; teams++){
            for(int players =0 ; players<=n; players++){
                if(players<teams){
                    dp[teams][players] = 0;
                }else if(teams==0 || players==0){
                    dp[teams][players] = 0;
                }
                else if(players == teams){
                    dp[teams][players] = 1;
                }else{
                    dp[teams][players] = dp[teams-1][players-1] + dp[teams][players-1]*teams;
                }
            }
        } 

        long res = dp[k][n];

        return res;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}