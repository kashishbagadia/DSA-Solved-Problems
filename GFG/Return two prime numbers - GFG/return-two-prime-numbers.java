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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.primeDivision(N);
            System.out.println(ans.get(0) + " " + ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> primeDivision(int N){
        List<Integer> res = new ArrayList<Integer>();
        for(int i = N-1; i >= N/2; i--){
            if(isPrime(i) && isPrime(N-i)){
                res.add(N-i);
                res.add(i);
            }
        }
        return res;
    }
    
    static boolean isPrime(int n){
        if(n == 1) return false;
        for(int i = 2; i <= n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}