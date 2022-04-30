import java.io.*;
import java.util.*;

public class minCostJourney {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // no of cities
        int[] cost = new int[n]; //cost of fillling gas in that city
        for(int i=0; i<cost.length; i++){
            cost[i] = scn.nextInt();
        }
        int[] dist = new int[n]; // remaining journey to be covered
        for(int i=0; i<dist.length; i++){
            dist[i] = scn.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = cost[0]*dist[0];
        int min = cost[0];

        for(int i=1; i<dp.length; i++){
            if(cost[i] > min){
                dp[i] = dist[i]*min + dp[i-1];
            }else{
                min = cost[i];
                dp[i] = dist[i]*min + dp[i-1];
            }
        }
      
        System.out.println(dp[n-1]);
        
    }
}
