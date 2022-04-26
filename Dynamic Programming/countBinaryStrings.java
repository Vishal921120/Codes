import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int oldCountZero = 1;
    int oldCountOne = 1;

    for(int i=2; i<=n; i++){
        int newCountZero = oldCountOne;
        int newCountOne = oldCountOne + oldCountZero;

        oldCountZero = newCountZero;
        oldCountOne = newCountOne;
    }

    System.out.println(oldCountOne + oldCountZero);

    // we can solve it by making 2 arrAYS BUT it will take space so we will not use it

    // int[] dp0 = new int[n+1];
    // int[] dp1 = new int[n+1];

    // dp0[1] =1;
    // dp1[1] =1;

    // for(int i=2; i<n+1 ; i++){
    //     dp0[i] = dp1[i-1];
    //     dp1[i] = dp1[i-1] + dp0[i-1]; 
    // }

    // System.out.println(dp0[n] + dp1[n]);
 }

}
