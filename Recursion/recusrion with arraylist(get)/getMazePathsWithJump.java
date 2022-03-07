import java.io.*;
import java.util.*;

public class getMazePathsWithJump {

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
        
        for(int jump = 1 ; sc+jump <= dc ; jump++){
            ArrayList<String> horizontalPath = getMazePaths(sr,sc+jump ,dr, dc);
            for(String str : horizontalPath){
                res.add("h" +jump + str);
            }
        }
        
        for(int jump = 1 ; sr+jump <= dr ; jump++){
            ArrayList<String> verticalPath = getMazePaths(sr+jump, sc , dr, dc);
            for(String str : verticalPath){
                res.add("v" + jump + str);
            }
            
        }
        
        for(int jump = 1 ; sr+jump <= dr && sc+jump <= dc ; jump++){
            ArrayList<String> diagonalPath = getMazePaths(sr+jump,sc+jump, dr, dc);
            for(String str : diagonalPath){
                res.add("d" + jump + str);
            }
            
        }
        
        return res;
        
    }

}