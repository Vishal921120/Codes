import java.io.*;
import java.util.*;

public class getStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {
        //base case
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        
        if((n-1)>=0){
            ArrayList<String> smallAns1 = getStairPaths(n-1);
            for(String str : smallAns1){
              ans.add(1 + str);
            }
        }
        
        if((n-2)>=0){
            ArrayList<String> smallAns2 = getStairPaths(n-2);
            for(String str : smallAns2){
              ans.add(2 + str);
            }
        }
        
        if((n-3)>=0){
            ArrayList<String> smallAns3 = getStairPaths(n-3);
            for(String str : smallAns3){
              ans.add(3 + str);
            }
        }
        
        return ans;
    }

}
