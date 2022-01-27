// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            int sum = 0;
            ArrayList<Character> alpha = new ArrayList<Character>();
            String str = "";
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(Character.isDigit(ch))
                sum+=(ch-'0');
                else
                alpha.add(ch);
            }
            Collections.sort(alpha);
            for(int i = 0; i < alpha.size(); i++)
            str = str + alpha.get(i);
            str += Integer.toString(sum);
            return str;
        }
}
