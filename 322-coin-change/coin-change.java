
class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int prev[] = new int[amount + 1];

        // Base case: using only the first coin
        for (int a = 0; a <= amount; a++) {
            if (a % coins[0] == 0) {
                prev[a] = a / coins[0];
            } else {
                prev[a] = (int)(1e9);
            }
        }

        // Process remaining coins
        for (int i = 1; i < n; i++) {
            int cur[] = new int[amount + 1];

            for (int a = 0; a <= amount; a++) {
                int pick = (int)(1e9);

                if (a >= coins[i]) {
                    pick = 1 + cur[a - coins[i]];
                }

                int noPick = prev[a];

                cur[a] = Math.min(pick, noPick);
            }

            prev = cur;
        }

        if (prev[amount] >= (int)(1e9)) {
            return -1;
        }

        return prev[amount];
    }
}
