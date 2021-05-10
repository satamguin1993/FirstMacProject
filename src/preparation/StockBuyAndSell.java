package preparation;

import java.util.Stack;

public class StockBuyAndSell {

    public static void main(String[] args) {
        int stock[] = {100, 180, 260, 310, 40, 535, 695};

        Stack<Integer> stack = new Stack<>();
        int max_profit = Integer.MIN_VALUE;
        int day_sell = 0;
        int day_buy = 0;
        int day = 0;
        stack.add(stock[0]);
        for (int i=1;i<stock.length;i++) {
            int price = stack.peek();
            if (stock[i] > price && max_profit < (stock[i] - price)) {
                max_profit = stock[i] - price;
                day_sell = i;
            } else if (price > stock[i]) {
                stack.pop();
                stack.push(stock[i]);
                day = i;
            }
            if (day_sell > day) {
                day_buy = day;
            }
        }
        System.out.println("We should buy stock : " + day_buy);
        System.out.println("We should sell stock : " + day_sell);
        System.out.println("Maximum profit : " + max_profit);
    }

}
