class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0; 
        int minBuy = prices[0]; 

        for (int i : prices) {
            maxP = Math.max(maxP, i - minBuy);
            minBuy = Math.min(minBuy, i);
        }

        return maxP;

    }
}
