package GfgChallenge;

public class MaximumProfitII {
        public int maximumProfit(int prices[]) {

            int minPrice = prices[0];
            int maxProfit = 0;

            for(int n : prices){
                if(n < minPrice){
                    minPrice = n;
                } else {
                    int profit = n - minPrice;
                    if(profit > maxProfit) maxProfit = profit;
                }
            }

            return maxProfit;

        }
}
