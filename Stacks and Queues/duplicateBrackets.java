import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      Stack<Character> stk = new Stack<>();
      for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
    
          if(ch ==')'){

            if(stk.peek()=='('){
              //No independent content inside braces
              System.out.println("true");
              return;
            }

            while(stk.peek()!='('){
              stk.pop();
            }
            stk.pop(); // "(" is balanced , hence pop

          }else{
            stk.push(ch);
          }
      }

      System.out.println("false");

    }

}
