import java.io.*;
import java.util.*;

public class merge2Sortedarray {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int[] c = new int[a.length + b.length];
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length){
        if(a[i]<=b[j]){public class merge2Sortedarray {
            
        }
        
            c[k++] = a[i++]; 
        }else{
            c[k++] = b[j++];
        }
    }
    while(i<a.length){
        c[k++]=a[i++];
    }
    while(j<b.length){
        c[k++]=b[j++];
    }
    
    return c;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}