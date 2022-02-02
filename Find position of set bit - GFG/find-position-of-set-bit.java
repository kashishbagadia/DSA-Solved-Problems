// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        int temp = N;
        int count = 0, res = 0;
        String str ="";
        while(temp!=0){
            str += (temp%2);
            temp = temp/2;
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') {
                count++;
                res = i+1;
            }
            
        }
        if(count > 1) return -1;
        if(count == 0) return -1;
        return res;
    }
};