import java.io.*;
import java.util.*;

public class targetSumSet {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        pTSS(arr, 0, "", target);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    // pTSS printTargetSumSubsets
    public static void pTSS(int[] arr, int idx, String set, int remTarget) {
        if (idx == arr.length) {
            if (remTarget == 0) {
                System.out.println(set + ".");
            }
            return;
        }

        // pruning step
        if (remTarget < 0) {
            return;
        }

        // yes
        pTSS(arr, idx + 1, set + arr[idx] + ", ", remTarget - arr[idx]);
        // no
        pTSS(arr, idx + 1, set, remTarget);
    }

}