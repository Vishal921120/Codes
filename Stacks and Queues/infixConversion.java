import java.io.*;
import java.util.*;

public class Main{

public static int precedence(char ch){
    if(ch=='*' || ch=='/'){
        return 2;
    }
    else if(ch=='+' || ch=='-'){
        return 1;
    }
    return 0;
}

public static void performOP(Stack<String> prefix, Stack<String> postfix, char op){
    String prefixB = prefix.pop();
    String prefixA = prefix.pop();
    prefix.push(op + prefixA + prefixB);

    String postfixB = postfix.pop();
    String postfixA = postfix.pop();
    postfix.push(postfixA + postfixB + op);
}
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Character> operator = new Stack<>();
    Stack<String> prefix = new Stack<>();
    Stack<String> postfix = new Stack<>();

    for(int i=0 ; i<exp.length(); i++){
        char ch = exp.charAt(i);

        if(ch>='a' && ch<='z'){
            //push in operand wali stack
            prefix.push(ch+""); //converting into string
            postfix.push(ch+"");
        }
        else if(ch=='('){
            operator.push(ch);
        }
        else if(ch==')'){
            while(operator.peek()!='('){
               char op = operator.pop();
               performOP(prefix,postfix,op);
            }
            operator.pop(); //pop opening braces as well
        }
        else if(ch=='+'|| ch=='-' || ch=='*' || ch=='/'){
            while(operator.size()>0 && operator.peek()!='(' &&
             precedence(ch)<=precedence(operator.peek())){
                char op = operator.pop();
               performOP(prefix,postfix,op);
            }
            operator.push(ch);
        }
    }
    while(operator.size()>0){
        char op = operator.pop();
        performOP(prefix,postfix,op);
        }

        System.out.println(postfix.peek());
        System.out.println(prefix.peek());
 }
}