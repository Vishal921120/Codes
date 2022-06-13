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

        int obsp = -prices[0]; // old buy state profit
        int ossp = 0;  // old sell state profit
        int ocsp = 0; // old cooldown state profit

        for(int i=1; i<prices.length; i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;

            if(ocsp - prices[i] > obsp) nbsp = ocsp - prices[i];
            else nbsp = obsp;
            
            if(obsp + prices[i] > ossp) nssp = obsp + prices[i];
            else  nssp = ossp;
            
            if(ossp > ocsp) ncsp = ossp;
            else ncsp = ocsp;
            
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }

        System.out.println(ossp);
    }

}