import java.io.*;
import java.util.*;

public class printKPC {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"  };  
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(0,str,"");

    }

    public static void printKPC(int idx ,String str, String output) {
        //base case
        if(idx==str.length()){
            System.out.println(output);
            return;
        }
        
        for(char letter : codes[str.charAt(idx) - '0'].toCharArray()){
            printKPC(idx+1, str, output+letter);
        }
        
    }

}