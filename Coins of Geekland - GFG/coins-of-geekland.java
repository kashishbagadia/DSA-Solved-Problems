// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int a[][] = new int[n][n];
		    
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(sc.next());
		        }
		    }
		    
		    int k = Integer.parseInt(sc.next());
		    Solution T = new Solution();
		    System.out.println(T.Maximum_Sum(a,n,k));
		}
	}
}// } Driver Code Ends


class Solution
{
    public int Maximum_Sum(int mat[][],int N,int k){
        
        
        int [][]sum = new int[N+1][N+1];
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                sum[i][j] = sum[i][j-1] + mat[i-1][j-1];
            }
        }
        for(int i=1; i<=N; i++){
            for(int j=2; j<=N; j++){
                sum[j][i] += sum[j-1][i] ;
            }
        }
       
        int max = 0;
        
        for(int i=k ; i<=N; i++){
            for(int j=k;j<= N; j++){
                int tem = sum[i][j] - sum[i][j-k] - sum[i-k][j] + sum[i-k][j-k];
                
                max = Math.max(max , tem);
            }
        }
        
        
        return max;
    }
}
