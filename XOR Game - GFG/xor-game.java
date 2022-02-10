// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.xorCal(k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int xorCal(int k){
        for(int i=1; i<100; i++)
       {
           int x = i^(i+1);
           if(x==k)
           {
               return i;
           }
       }
       return -1;
    }
}