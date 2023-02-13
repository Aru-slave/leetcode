class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyAmt = prices[0];
        for(int i = 0; i < prices.length; i++)
        {
            if(buyAmt > prices[i])
            {
                buyAmt = prices[i];
            }
            else if (profit < (prices[i] - buyAmt))
            {
                profit = prices[i] - buyAmt;
            }
        }
        return profit;
    }
}