import java.io.*;
import java.util.*;

public class floodfill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "" , visited);
        
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] vis) {
        int dr = maze.length-1;
        int dc = maze[0].length -1;
        
        if(sr>dr || sc>dc || sr<0 || sc<0 || maze[sr][sc]==1 || vis[sr][sc]==true){
            //negative base case
            return;
        }
        
        if(sr==dr && sc==dc){
            //positive base case
            System.out.println(asf);
            return;
        }
        
        vis[sr][sc] = true; //node pre
        
        floodfill(maze,sr-1,sc,asf+"t",vis);
        floodfill(maze,sr,sc-1,asf+"l",vis);
        floodfill(maze,sr+1,sc,asf+"d",vis);
        floodfill(maze,sr,sc+1,asf+"r",vis);
        
        vis[sr][sc] = false; //backtracking // node post
        
        
    
    }
}
