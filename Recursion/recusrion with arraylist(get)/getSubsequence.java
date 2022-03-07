import java.io.*;
import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(0,str);
        System.out.println(res);

    }

    public static ArrayList<String> gss(int idx ,String str) {
        //base case 
        if(idx==str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        //Faith
        ArrayList<String> smallAns = gss(idx+1, str);
        
        //Meeting Expectation
        ArrayList<String> ans = new ArrayList<>();
        
        //No 
        for(String smallSubSet : smallAns){
            ans.add(smallSubSet);
        }
        
        //yes 
        for(String smallSubSet : smallAns){
            ans.add(str.charAt(idx) + smallSubSet);
        }
        
        return ans;
        
    }

}
