class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for (int i : prices) {
            max = Math.max(max, i - min);
            min = Math.min(i, min);
        }

        return max;
    }
}
