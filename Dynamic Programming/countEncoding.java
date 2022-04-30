import java.io.*;
import java.util.*;

public class countEncoding {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int[] dp = new int[str.length()];
        dp[0] = 1;

        for(int i=1; i<dp.length; i++){
            //no. ending with 00 like 25300,5500,00
            if(str.charAt(i-1)=='0' && str.charAt(i)=='0'){
                dp[i] = 0;
            }
            //no. ending with 0 and non zero like 54103,01,2501
            else if(str.charAt(i-1)=='0' && str.charAt(i)!='0'){
                dp[i] = dp[i-1];
            }
            //no. ending with non zero and zero like 560,10,4450
            else if(str.charAt(i-1)!='0' && str.charAt(i)=='0'){
                // second last no. should be less than 3, so only 1 and 2 allowed
                // no. likes 5220 , 2310
                if(str.charAt(i-1)=='1' || str.charAt(i-1)=='2'){
                    dp[i] = (i>=2 ? dp[i-2] : 1);
                }
                //no.likes 530,290
                else{
                    dp[i] = 0;
                }
            }
            // ending with non zeros no. likes 556,123,43
            else{
                // when last 2 digits is less than 26 like 512,416
                if(Integer.parseInt(str.substring(i-1,i+1))<=26){
                   dp[i] = dp[i-1] + (i>=2 ? dp[i-2] : 1);
                }
                // when last 2 digts are greater than 26 like 527,443 
                else{
                    dp[i] = dp[i-1];
                }
            }
        }

        System.out.println(dp[str.length()-1]);

    }
}