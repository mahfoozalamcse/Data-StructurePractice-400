package Test8;

import java.io.*;
import java.util.*;


// // 4. The Longest Common Subsequence
class Result {

    public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
        int n = a.size();
        int m = b.size();
        int[][] dp = new int[n + 1][m + 1];

        // Step 1: Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a.get(i - 1).equals(b.get(j - 1))) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Step 2: Reconstruct the subsequence
        List<Integer> lcs = new ArrayList<>();
        int i = n, j = m;
        while (i > 0 && j > 0) {
            if (a.get(i - 1).equals(b.get(j - 1))) {
                lcs.add(a.get(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Reverse to get correct order
        Collections.reverse(lcs);
        return lcs;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
      
    }
}

