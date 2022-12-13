class Solution {
    public int getMoneyAmount(int n) {
        // int[][] dp = new int[n+1][n+1];
        // for(int rows[] : dp) Arrays.fill(rows, -1);
        // return solve(1, n, dp);   
        return solveTab(n);
           
    }
    
    public int solveTab(int n){
        int[][] dp = new int[n+2][n+2];
        for(int rows[] : dp) Arrays.fill(rows, 0);
        for(int start = n; start>=1; start--){
            for(int end = start; end <=n; end++){
                if(start == end) continue;
                else{
                    int max = Integer.MAX_VALUE;
        
                    for(int i = start; i<=end; i++){
                        max = Math.min(max, i + Math.max(dp[start][i-1], dp[i+1][end]));
                    }

                    dp[start][end] = max;
                    
                }
            }
        }
        return dp[1][n];
        
    }
    
    public int solve(int start, int end, int[][]dp){
        if(start>=end) return 0;
        if(dp[start][end]!=-1) return dp[start][end];
        
        int max = Integer.MAX_VALUE;
        
        for(int i = start; i<=end; i++){
            max = Math.min(max, i + Math.max(solve(start, i-1, dp), solve(i+1, end, dp)));
        }
        
        return dp[start][end] = max;
        
    }
}