class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int price = prices[0];
        for(int i = 1; i < prices.length; i++)
        {
            if(price > prices[i])
            {
                price = prices[i];//작은 값이 나오면 지불 값 변경
            }
            else if (profit < (prices[i] - price))
            {
                profit = prices[i] - price; 
            }
        }
        return profit;
    }
}