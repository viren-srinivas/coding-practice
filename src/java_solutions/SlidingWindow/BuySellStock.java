package java_solutions.SlidingWindow;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        int currentProfit;

        for (int price : prices) {
            if (price < buyPrice)
                buyPrice = price;

            currentProfit = price - buyPrice;
            if (currentProfit > profit)
                profit = currentProfit;
        }
        return profit;
    }
}