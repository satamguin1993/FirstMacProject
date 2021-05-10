package preparation;

import java.util.Arrays;

public class Dynamic_Limited_Coin_Change {

    public static void main(String[] args) {
        int[] coins = {9, 6, 5, 1};
        int w = 11;

        int ways = findWays(coins, coins.length, w);
        System.out.println("Total number of ways : " + ways);
    }

    private static int findWays(int[] coins, int len, int w) {

        int[] table = new int[w+1];
        Arrays.fill(table, Integer.MAX_VALUE);
        table[0] = 0;

        for (int i=1;i<=w;i++) {
            for (int j=0;j<len;j++) {
                if (coins[j] <= i) {
                    int sub = table[i-coins[j]];
                    if (sub != Integer.MAX_VALUE && sub + 1 < table[i]) {
                        table[i] = sub + 1;
                    }
                }
            }
        }
        return table[w];
    }

}
