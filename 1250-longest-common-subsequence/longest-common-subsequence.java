
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int prev[] = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            int cur[] = new int[m + 1];
            cur[0] = 0;

            for (int j = 1; j <= m; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    cur[j] = 1 + prev[j - 1];
                } else {
                    int case1 = prev[j];
                    int case2 = cur[j - 1];

                    cur[j] = Math.max(case1, case2);
                }
            }

            prev = cur;
        }

        return prev[m];
    }
}
