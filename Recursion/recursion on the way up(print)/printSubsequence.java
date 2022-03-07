import java.io.*;
import java.util.*;

public class printSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(0,str,"");

    }

    public static void printSS(int idx , String str, String ans) {
        //base case 
        if(idx == str.length()){
            System.out.println(ans);
            return ;
        }
        
        char ch = str.charAt(idx);
        //yes
        printSS(idx+1, str, ans+ch);
        //no
        printSS(idx+1, str, ans);
        
        
    }

}