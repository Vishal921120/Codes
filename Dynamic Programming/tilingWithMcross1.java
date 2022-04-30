import java.io.*;
import java.util.*;
// prerequisite of this question = tiling with 2 * 1
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[] dp = new int[n+1];

        for(int i=0; i<dp.length; i++){
            if(i<m){
                dp[i] = 1;
            }else if(i==m){
                dp[i] = 2;
            }else {
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        System.out.println(dp[n]);

    }
}
