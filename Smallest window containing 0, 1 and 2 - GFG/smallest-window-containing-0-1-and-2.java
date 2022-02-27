// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        int l0 = -1, l1 = -1, l2 = -1;
        int l = Integer.MAX_VALUE;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i)=='0') l0 = i;
            else if(S.charAt(i)=='1') l1=i;
            else l2=i;
            if(l0!=-1 && l1!=-1 && l2!=-1){
                int max = Math.max(l0, Math.max(l1,l2));
                int min = Math.min(l0, Math.min(l1,l2));
                l = Math.min(max-min+1,l);
            }
        }
        if(l0==-1||l1==-1||l2==-1) return -1;
        return l;
    }
};
