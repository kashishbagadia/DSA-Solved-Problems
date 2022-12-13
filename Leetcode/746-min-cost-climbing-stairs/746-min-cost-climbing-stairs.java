class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        return solve(cost,n);
    }
    public int solve(int[] cost, int n){
        
        int prev1 = cost[0];
        int prev2 = cost[1];
        for(int i = 2; i < n; i++){
            int curr = cost[i] + Math.min(prev1, prev2);
            prev1 = prev2;
            prev2 = curr;
        }
        return Math.min(prev1, prev2);
    }
}