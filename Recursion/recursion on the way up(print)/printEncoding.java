import java.io.*;
import java.util.*;

public class printEncoding {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printEncodings(0, str, "");

    }

    public static void printEncodings(int idx, String str, String output) {
        // base case
        if (str.length() == idx) {
            System.out.println(output);
            return;
        }

        // corner case
        int ch1 = str.charAt(idx) - '0';
        if (ch1 > 0 && ch1 < 10) {
            printEncodings(idx + 1, str, output + (char) ('a' + ch1 - 1));
        }

        if (idx + 1 < str.length()) {
            int ch2 = (str.charAt(idx) - '0') * 10 + (str.charAt(idx + 1) - '0');
            if (ch2 > 9 && ch2 < 27) {
                printEncodings(idx + 2, str, output + (char) ('a' + ch2 - 1));
            }
        }

    }

}