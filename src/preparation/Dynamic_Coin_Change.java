package preparation;

import java.util.Arrays;

public class Dynamic_Coin_Change {

    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int w = 5;

        int s = findWays(coins, coins.length, w);

        System.out.println("Number of ways: " + s);

    }

    private static int findWays(int[] coins, int len, int w) {

        int table[] = new int[w+1];
        Arrays.fill(table, 0);

        table[0] = 1;
        for (int i=0;i<len;i++) {
            for (int j=coins[i];j<=w;j++) {
                table[j] = table[j] + table[j-coins[i]];
            }
        }

        return table[w];
    }

}
