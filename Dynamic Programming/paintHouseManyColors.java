import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // Scanner scn =new Scanner(System.in);
        // int n = scn.nextInt();
        // int c = scn.nextInt();
        // int[][] arr = new int[n][c];

        // for(int i =0 ; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         arr[i][j] = scn.nextInt();
        //     }
        // }

        // int[][] dp = new int[arr.length][arr[0].length];
        // //for first column 
        // for(int j=0; j<arr[0].length; j++){
        //     dp[0][j] = arr[0][j];
        // }

        //for remaining 
        // for(int i=1; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         int min = Integer.MAX_VALUE;
        //         for(int k=0; k<arr[0].length; k++){
        //             if(k!=j){
        //                 // if(min>dp[i-1][k]){
        //                 //     min = dp[i-1][k];
        //                 // }
        //                 min = Math.min(min,dp[i-1][k]);
        //             }
        //         }

        //         dp[i][j] = arr[i][j] + min;
        //     }
        // }

        // int min = Integer.MAX_VALUE;
        // for(int j=0; j<dp[0].length; j++){
        //     if(min>dp[n-1][j]){
        //         min = dp[n-1][j];
        //     }
        // }

        // System.out.println(min);

        // the above code has time complexity n cube
        // below code will give n square

        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[n][c];

        for(int i =0 ; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[arr.length][arr[0].length];
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;

        //for first column 
        for(int j=0; j<arr[0].length; j++){
            dp[0][j] = arr[0][j];
            if(arr[0][j]<=least){
                sleast = least;
                least = arr[0][j];
            }else if(arr[0][j]<=sleast){
                sleast = arr[0][j];
            }
        }

         //for remaining 
        for(int i=1; i<arr.length; i++){
               int nleast = Integer.MAX_VALUE; //new least
               int nsleast = Integer.MAX_VALUE; //new second least
            for(int j=0; j<arr[0].length; j++){

               if(least != dp[i-1][j]){
                   dp[i][j] = arr[i][j] + least;
               }else{
                   dp[i][j] = arr[i][j] + sleast;
               }

               if(dp[i][j]<=nleast){
                nsleast = nleast;
                nleast = dp[i][j];
               }else if(dp[i][j]<=nsleast){
                nsleast = dp[i][j];
               }

            }
               least = nleast;
               sleast = nsleast;
        }
        System.out.println(least);

    }
}
