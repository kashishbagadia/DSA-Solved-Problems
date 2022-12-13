class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        return solveTab(satisfaction);        
    }
    public int solveTab(int[] satisfaction){
        int n = satisfaction.length;
        int dp[][] = new int[n+1][n+1];
        for(int rows[] : dp) Arrays.fill(rows, 0);

        for(int index = n-1; index >= 0; index--){
            for(int time = index; time>=0; time--){
                int include = satisfaction[index]*(time+1) + dp[index+1][time+1];
                int exclude = dp[index+1][time];
                dp[index][time] = Math.max(include, exclude); 
            }            
        }
        return dp[0][0];
    } 
    
    public int solve(int[] satisfaction, int index, int time, int[][] dp){
        if(index == satisfaction.length) return 0;
        if(dp[index][time]!=-1) return dp[index][time];
        int include = satisfaction[index]*(time+1) + solve(satisfaction, index+1, time+1, dp);
        int exclude = solve(satisfaction, index+1, time, dp);
        return dp[index][time] = Math.max(include, exclude);
    }
    
}