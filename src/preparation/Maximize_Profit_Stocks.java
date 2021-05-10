package preparation;

public class Maximize_Profit_Stocks {

    public static void main(String[] args) {
        int stocks[] = {100, 180, 260, 310, 40, 535, 695};

        int profit_by_single_buy_single_sell = getProfitBySingleBuySingleSell(stocks);
        int maximum_profit = getMaximumProfit(stocks);

        System.out.println("profit_by_single_buy_single_sell : " + profit_by_single_buy_single_sell);
        System.out.println("maximum_profit : " + maximum_profit);

    }

    private static int getMaximumProfit(int[] stocks) {

        int first_buy_index = getFirstMinIndex(stocks);
        if (first_buy_index != -1) {
            for(int i=first_buy_index+1;i<stocks.length; i++) {
                //TODO needed to complete this code
            }
        }

        return 0;
    }

    private static int getFirstMinIndex(int[] stocks) {
        int min_stocks = stocks[0];
        int index = -1;
        for(int i=1;i<stocks.length;i++) {
            if(min_stocks > stocks[i]) {
                index = i;
                break;
            } else
                continue;
        }
        return index;
    }

    private static int getProfitBySingleBuySingleSell(int[] stocks) {
        int maximum_profit = Integer.MIN_VALUE;
        int buy = stocks[0];
        for(int i=1;i<stocks.length;i++) {
            int sell = stocks[i];
            if(sell > buy) {
                int profit = sell - buy;
                if(profit > maximum_profit)
                    maximum_profit = profit;
            } else {
                buy = sell;
            }
        }
        return maximum_profit;
    }
}
