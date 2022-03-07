import java.io.*;
import java.util.*;

public class Main {

  public static class CustomStack {
    int[] arr;
    int top;

    public CustomStack(int cap) {
      //costructor 
      arr = new int[cap];
      top = -1;
    }

    int size() {
      // write ur code here
      return top+1;
    }

    void display() {
      // write ur code here
      for(int i=top ; i>=0; i--){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }

    void push(int val) {
      // write ur code here
      if(top==arr.length-1){
          //Stack overflow
          System.out.println("Stack overflow");
          return;
      }
      top++;
      arr[top] = val;
    }

    int pop() {
      // write ur code here
      if(top==-1){
        //stack underflow
        System.out.println("Stack underflow");
        return -1;
      }
      int val = arr[top];
      top--;
      return val;
    }

    int top() {
       // write ur code here
       if(top==-1){
        //stack underflow
        System.out.println("Stack underflow");
        return -1;
      }
      int val = arr[top];
      return val;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}