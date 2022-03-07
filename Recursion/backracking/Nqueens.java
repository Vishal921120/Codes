import java.io.*;
import java.util.*;

public class Nqueens {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] chess = new boolean[n][n];
        printNQueens(chess,"",0);
        
    }
    
    public static boolean isQueenSafe(boolean[][] chess, int row , int col){
        //upward column
        for(int i=0; i<row; i++){  //try changing it in chess.length
            if((chess[i][col])==true){
                return false;
            }
        }
        
        //upward right diagonal
        int i=row;
        int j=col;
        while(i>=0 && j<chess.length){
            if((chess[i][j])==true){
                return false;
            }
            i--; j++;
        }
        
        //upward left diagonal
        i= row ; j= col;
        while(i>=0 && j>=0){
            if((chess[i][j])==true){
                return false;
            }
            i--;j--;
        }
        
        return true;
        
    }

    public static void printNQueens(boolean[][] chess, String qsf, int row) {
        if(row==chess.length){
            System.out.println(qsf + ".");
            return;
        }
        
        for(int col=0; col<chess[0].length; col++){
            if(isQueenSafe(chess,row,col)==true){
                chess[row][col] = true; //edge pre
                printNQueens(chess, qsf+row+"-"+col+", ", row+1); //call
                chess[row][col] = false; //edge post
            }
        }
        
    }
    
}
