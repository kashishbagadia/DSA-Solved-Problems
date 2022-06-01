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
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.shiftPile(N, n);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> res;
    static int count;
    
    static void movePlate(int n, int fb, int tb){
        count += 1;
        if(count == n){
            res.add(fb);
            res.add(tb);
            return;
        }
    }
    
    static void movePile(int N, int n, int fb, int tb, int wb)
    {
        if(N >= 1 && count < n){
            movePile(N-1, n, fb, wb, tb);
            movePlate(n, fb, tb);
            if(res.size() > 0)
                return;
            movePile(N-1, n, wb, tb, fb);
        }
    }
    static List<Integer> shiftPile(int N, int n){
        res = new ArrayList<>();
        count = 0;
        movePile(N, n, 1, 3, 2);
        return res;
    }
}