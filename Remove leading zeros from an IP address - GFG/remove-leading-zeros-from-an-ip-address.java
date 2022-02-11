// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
        String res="";
        String[] arrOfStr = S.split("\\.");
        for (String a : arrOfStr){
            res += "." + new java.math.BigInteger(a).toString();
        }
        return res.substring(1);
        
            
    }
}