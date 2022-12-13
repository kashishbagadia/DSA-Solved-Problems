class Solution {
    public int minSideJumps(int[] obstacles) {
        int dp[][] = new int[4][obstacles.length];
        for(int rows[] : dp) Arrays.fill(rows, -1);
        return solve(obstacles, 2, 0, dp);        
    }
    public int solve(int[] obstacles, int currlane, int pos, int[][] dp){
        int n = obstacles.length - 1;
        if(pos == n) return 0;
        if(dp[currlane][pos]!= -1) return dp[currlane][pos];
        if(obstacles[pos+1]!=currlane) return solve(obstacles, currlane, pos+1, dp);
        else{
            int ans = Integer.MAX_VALUE;
            for(int i = 1; i<=3; i++){
                if(currlane!=i && obstacles[pos]!=i) ans = Math.min(ans, 1+solve(obstacles, i, pos, dp));
            }
            dp[currlane][pos] = ans;
            return dp[currlane][pos];
        }
        
    }
}