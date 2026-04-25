class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int buy = Integer.MAX_VALUE;
        int c = 0;

        for(int i: prices)
        {
            buy = Math.min(buy, i);
            c = i-buy;
            profit = Math.max(c, profit);
        }


        return profit;
    }
}
