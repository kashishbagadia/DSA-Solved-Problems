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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int[][] blocked_cells = new int[k][2];
            for(int i = 0; i < k; i++){
                String[] s1 = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    blocked_cells[i][j] = Integer.parseInt(s1[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.FindWays(n, m, blocked_cells);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
   public int FindWays(int n, int m, int[][] blocked_cells)
   {
       // Code here
       int modulus = 1_000_000_007;
       int[][] newGrid = new int[n][m];
       for(int[] block:blocked_cells){
           //grid at these coordinates are blocked
           newGrid[block[0]-1][block[1]-1] = -1;
       }
       if(newGrid[0][0] < 0){
           return 0;
       }
       newGrid[0][0] = 1;
       //find all the paths to the final location
       for(int i = 0; i < n; i++){
           for(int j = 0; j < m; j++){
               //if the cell is blocked
               if(newGrid[i][j] < 0){
                   continue;
               }
               //if it is the first column or row
               if(i == 0 && j-1 >= 0 && newGrid[i][j-1] == 1){
                   newGrid[i][j] = 1;
                   continue;
               }
               if(j == 0 && i-1 >= 0 && newGrid[i-1][j] == 1){
                   newGrid[i][j] = 1;
                   continue;
               }
               //if the cell is not blocked we will add
               if(i-1 >= 0 && newGrid[i-1][j] > 0){
                   newGrid[i][j] = (newGrid[i][j] + newGrid[i-1][j])%modulus;
               }
               //if the cell is not blocked we will add
               if(j-1 >= 0 && newGrid[i][j-1] > 0){
                   newGrid[i][j] = (newGrid[i][j] + newGrid[i][j-1])%modulus;
               }
           }
       }
       return newGrid[n-1][m-1] < 0 ? 0:newGrid[n-1][m-1];
   }
}