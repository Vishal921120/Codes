import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    long os = 1;
    long ob = 1; // os is count old space and ob is count old building

    for(int i=2 ; i<n+1; i++){
        long ns = ob + os;
        long nb = os;

        os = ns;
        ob = nb;
    }

    long total = os + ob; // combination of building and space on one side of road
    total = total * total; // for both side

    System.out.println(total);
    
 }

}