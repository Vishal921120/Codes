import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fibn = FibMemoized(n , new int[n+1]);
    System.out.println(fibn);
 }

 public static int FibMemoized(int n , int[] qb ){
     // qb is our question bank
     if(n==0 || n==1) return n ; //base case 
     if(qb[n] != 0) return qb[n]; 

     int fibn1 = FibMemoized(n-1 , qb);
     int fibn2 = FibMemoized(n-2, qb);
     int fibn = fibn1 + fibn2;

     qb[n] = fibn;  // memoized 

     return fibn;
 }

}
