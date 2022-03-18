// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
        int res[] = new int[2];
        int ans_l = 0, ans_r = 0;
        int l = 0, r = arr.length-1, diff = Integer.MAX_VALUE;
        while(l<r){
            if(Math.abs(arr[l]+arr[r]-x) < diff){
                ans_l = arr[l];
                ans_r = arr[r];
                diff = Math.abs(arr[l]+arr[r]-x);
            }
            if(arr[l]+arr[r] < x) l++;
            else r--;
        }
        res[0] = ans_l;
        res[1] = ans_r;
        return res;
    }
}