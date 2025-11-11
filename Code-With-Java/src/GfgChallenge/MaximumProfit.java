package GfgChallenge;

public class MaximumProfit {
    public int maximumProfit(int prices[]) {
        int buy = 0;
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}
