class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int rows[] : dp) Arrays.fill(rows, -1);
       return solve(0, 1, prices, dp);        
    }
    public int solve(int index, int buy, int[] prices, int[][] dp){
        if(index == prices.length) return 0;
        if(dp[index][buy]!=-1) return dp[index][buy];
        
        int profit = 0;
        if(buy==1){
            int buyKaro = -prices[index] + solve(index+1, 0, prices, dp);
            int skipKaro = solve(index+1, 1, prices, dp);
            profit = Math.max(buyKaro, skipKaro);
        }else{
            int sellKaro = prices[index] + solve(index+1, 1, prices, dp);
            int skipKaro = solve(index+1, 0, prices, dp);
            profit = Math.max(sellKaro, skipKaro);
            
        }
        
        return dp[index][buy] = profit;
    }
}