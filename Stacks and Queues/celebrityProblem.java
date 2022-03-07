import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);
    }

    public static void findCelebrity(int[][] arr) {
        Stack<Integer> potentialCeleb = new Stack<>();
        for(int i=0; i<arr.length; i++){
           potentialCeleb.push(i);
        }
        while(potentialCeleb.size()>1){
           int y = potentialCeleb.pop();
           int x = potentialCeleb.pop();

           if(arr[x][y]==1){
              //x knows y -> x can't be celeb
              potentialCeleb.push(y); // y may or may not be a celeb
           }else{
              //x doesn't know y -> y can't be celeb
              potentialCeleb.push(x); //x may or may not be a celeb
           }
        }

        //confirmation;
        int x = potentialCeleb.pop();

        //its rows should be 0(x should know nobody)
        for(int j=0; j<arr.length; j++){
           if(j==x) continue; // x may or may not know itself, so we skip
           if(arr[x][j]==1){
              System.out.println("none");
              return;
           }
        }

        //its col should be 1 (everybody knows x)
        for(int i=0; i<arr.length; i++){
           if(i==x) continue;
           if(arr[i][x]==0){
              System.out.println("none");
              return;
           }
        }
        System.out.println(x);
    }

}
