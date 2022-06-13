import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] prices = new int[n];
        for(int i =0; i<prices.length; i++){
            prices[i] = scn.nextInt();
        }

        int maxProfitIfSoldToday = 0;
        int leastSoFar = prices[0];
        int[] dpMaxIfSellToday = new int[prices.length];

        for(int i=1; i<prices.length; i++){
            if(leastSoFar > prices[i]) leastSoFar = prices[i];
            maxProfitIfSoldToday = prices[i] - leastSoFar;

            if(dpMaxIfSellToday[i-1] < maxProfitIfSoldToday){
                dpMaxIfSellToday[i] = maxProfitIfSoldToday;
            }else dpMaxIfSellToday[i] = dpMaxIfSellToday[i-1];   

        }   

        int maxProfitIfBuyToday = 0;
        int maxAfterToday = prices[prices.length-1];
        int[] dpMaxIfBuyToday = new int[prices.length];

        for(int i= prices.length-2; i>=0; i--){
            if(maxAfterToday < prices[i]){
                maxAfterToday = prices[i];
            }

            maxProfitIfBuyToday = maxAfterToday - prices[i];
            if(maxProfitIfBuyToday > dpMaxIfBuyToday[i+1]){
                dpMaxIfBuyToday[i] = maxProfitIfBuyToday;
            }else dpMaxIfBuyToday[i] = dpMaxIfBuyToday[i+1];

        }
          
        int max =0;
        for(int i=0; i<prices.length; i++){
            if(max < dpMaxIfBuyToday[i] + dpMaxIfSellToday[i]){
                max = dpMaxIfBuyToday[i] + dpMaxIfSellToday[i];
            }
        }

        System.out.println(max);

    }public class BBSwith2transactions {
        
    }
    
}