import java.io.*;
import java.util.*;

public class getMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePaths(0,0,n-1,m-1); // focus here
        System.out.println(paths);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //Negative baseCase
        if(sr>dr || sc > dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        
        //positive basecase
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> res = new ArrayList<>();
        
        ArrayList<String> horizontalPath = getMazePaths(sr, sc+1 , dr, dc);
        for(String str : horizontalPath){
            res.add("h" + str);
        }
        
        ArrayList<String> verticalPath = getMazePaths(sr+1, sc , dr, dc);
        for(String str : verticalPath){
            res.add("v" + str);
        }
        
        return res;
        
    }

}
