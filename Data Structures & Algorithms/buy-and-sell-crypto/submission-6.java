class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minBuy = Integer.MAX_VALUE;

        for (int price : prices) {
            minBuy = Math.min(minBuy, price);
            maxPrice = Math.max(maxPrice, price - minBuy); 
        }

        return maxPrice; 
    }
}
