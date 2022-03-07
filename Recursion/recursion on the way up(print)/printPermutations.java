import java.io.*;
import java.util.*;

public class printPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");

    }

    public static void printPermutations(String str, String output) {
        if (str.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newInput = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newInput, output + str.charAt(i));
        }

    }

}