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

        int fee = scn.nextInt();

        int oldbuyStateProfit = -prices[0];
        int oldSellStateProfit = 0;

        for(int i=1; i<prices.length; i++){
            int newBuyStateProfit = 0;
            int newSellStateProfit = 0;

            if(oldSellStateProfit - prices[i] > oldbuyStateProfit){
                newBuyStateProfit = oldSellStateProfit - prices[i];
            }else{
                newBuyStateProfit = oldbuyStateProfit;
            }

            if(oldbuyStateProfit + prices[i] - fee > oldSellStateProfit){
                newSellStateProfit = oldbuyStateProfit + prices[i] - fee ;
            }else{
                newSellStateProfit = oldSellStateProfit;
            }

            oldbuyStateProfit = newBuyStateProfit;
            oldSellStateProfit = newSellStateProfit;
        }

        System.out.println(oldSellStateProfit);
    }

}
