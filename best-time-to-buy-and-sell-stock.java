class Solution {
    public int maxProfit(int[] prices) {

        int max_profit = 0;

        int min_buy = Arrays.stream(prices).max().getAsInt();

        for(int i = 0; i < prices.length; i++) {
            if(min_buy > prices[i]) {
                min_buy = prices[i];
            }
            if(max_profit < prices[i] - min_buy) {
                max_profit = prices[i] - min_buy;
            }
        }

        return max_profit;

    }
}
