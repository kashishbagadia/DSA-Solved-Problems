// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
        
        if(A.length()!=B.length()) return -1;
        int sum = 0;
        for(int i = 0; i<A.length();i++){
            sum+=(int)A.charAt(i);
            sum-=(int)B.charAt(i);
        }
        if(sum!=0) return -1;
        int n1 = A.length()-1;
        int n2 = B.length()-1;
        int res = 0;
        while(n1>=0 && n2>=0){
            if(A.charAt(n1) == B.charAt(n2)){
                n1--;
                n2--;
            } 
            else{
                n1--;
                res++;
            }
        }
        return res;
    }
}