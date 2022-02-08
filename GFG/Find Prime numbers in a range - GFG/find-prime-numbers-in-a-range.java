// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        int count = 0;
        if(M==1) M++;
        for(int i = M; i <=N; i++ ){
            count = 0;
            for(int j = 2; j <=Math.round(Math.sqrt(i)); j++){
                if(i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0) {
                p.add(i);
            }
        }
        return p;
    }
}