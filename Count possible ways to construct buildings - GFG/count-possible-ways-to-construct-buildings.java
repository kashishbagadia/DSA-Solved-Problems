// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
        int[][] dp = new int[2][N+1];
        dp[0][0] = 0;
        dp[1][0] = 0;
        dp[0][1] = 1;
        dp[1][1] = 1;
        
        for(int i = 2; i < N+1; ++i) {
            dp[0][i] = dp[1][i-1] % 1000000007;
            dp[1][i] = (dp[0][i-1] % 1000000007 + dp[1][i-1] % 1000000007) % 1000000007;
        }
        
        long sum = (dp[0][N] + dp[1][N]) % 1000000007;
        long ans = (sum * sum) % 1000000007;
        return (int)ans;
    }
}