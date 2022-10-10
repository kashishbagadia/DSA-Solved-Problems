class Solution {
    public int numTrees(int n) {
//         if(n<=1) return 1;
//         int ans = 0;
        
//         for(int i = 1; i <= n; i++){
//             ans += numTrees(i-1) * numTrees(n-i);            
//         }
        
//         return ans;
        // int[] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        return solveTab(n);
    }
    public int solveTab(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        dp[0] = dp[1] = 1;
        for(int i = 2; i<=n; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }
}