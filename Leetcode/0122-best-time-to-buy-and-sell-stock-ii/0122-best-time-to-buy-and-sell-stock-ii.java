class Solution {
    public int maxProfit(int[] prices) {
       //  int[][] dp = new int[prices.length][2];
       //  for(int rows[] : dp) Arrays.fill(rows, -1);
       // return solve(0, 1, prices, dp);  
        return solveTab(prices);
    }
    
    public int solveTab(int[] prices){
        int[][] dp = new int[prices.length+1][2];
        for(int rows[] : dp) Arrays.fill(rows, 0);
        
        for(int index = prices.length-1; index>=0; index--){
            for(int buy = 0; buy <= 1; buy++){
                int profit = 0;
                if(buy==1){
                    int buyKaro = -prices[index] + dp[index+1][0];
                    int skipKaro = dp[index+1][1];
                    profit = Math.max(buyKaro, skipKaro);
                }else{
                    int sellKaro = prices[index] + dp[index+1][1];
                    int skipKaro = dp[index+1][0];
                    profit = Math.max(sellKaro, skipKaro);

                }

                dp[index][buy] = profit;                
            }
        }
        return dp[0][1];
        
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