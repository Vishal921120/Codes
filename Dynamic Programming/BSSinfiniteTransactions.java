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

        int buyDay = 0;
        int sellDay = 0;
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] >= prices[i-1]){
                sellDay++;
            }else{
                profit += prices[sellDay] - prices[buyDay];
                sellDay = buyDay = i;
            }
        }

        profit += prices[sellDay] - prices[buyDay]; //for last increasing stock price

        System.out.println(profit);
    }

}
