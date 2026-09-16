class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int n = prices.length;
        int profit = 0;
        while(j < n){
            if(prices[j] < prices[i]){
                i = j;
            }
            if(prices[j] - prices[i] > profit){
                profit = prices[j] - prices[i];
            }
            j++;
        }
        return profit;
    }
}