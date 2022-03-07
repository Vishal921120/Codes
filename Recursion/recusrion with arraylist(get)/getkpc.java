import java.io.*;
import java.util.*;

public class getkpc{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> words = getKPC(0,str);
        System.out.println(words);
    }
    
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs",
        "tu","vwx","yz"
    };

    public static ArrayList<String> getKPC(int idx ,String str) {
        //base case
        if(idx==str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        //faith
        ArrayList<String> smallAns = getKPC(idx+1 , str);
        
        //meeting expectation
        ArrayList<String> ans = new ArrayList<>();
        
        //read about toCharArray from below for better understanding
        for(Character letter : codes[str.charAt(idx) - '0'].toCharArray()){
            for(String smallstr : smallAns){
                ans.add(letter + smallstr);
            }
        }
        
        //Another way of writing above code with for loop 
        
        // String letter = codes[str.charAt(idx) - '0'];
        // for(int i=0; i<letter.length(); i++){
        //     char ch = letter.charAt(i);
        //     for(int j=0; j<smallAns.size(); j++){
        //         String smallstr = smallAns.get(j);
        //         ans.add(ch + smallstr);
        //     }
        // }
        
        return ans;
        
    }

}

//The java string toCharArray() method converts the given string into a sequence of characters. The returned array length is equal to the length of the string.