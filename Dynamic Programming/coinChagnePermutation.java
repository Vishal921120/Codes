import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        int[] dp = new int[tar+1];
        dp[0] = 1; // paying 0 has one way to not pay anything

        for(int amt = 1; amt <= tar ; amt++){
            for(int coin : arr){
                if(amt >= coin){
                    int remAmt = amt - coin;
                    dp[amt] += dp[remAmt];
                }
            }
        }

        System.out.println(dp[tar]);

    }
}
