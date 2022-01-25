// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
   static int leastWeightCapacity(int[] arr, int N, int D) {
       // code here
       int left=0, right =0;
       for( int w : arr)
       {
           left = Math.max(left, w);
           right += w;
       }
       while(left<right)
       {
           int mid = (left+right)/2;
           int requirement = 1, tillnow= 0;
           for(int w: arr)
           {
               if(tillnow + w > mid)
               {
                   requirement += 1;
                   tillnow =0;
               }
               tillnow += w;
           }
           if( requirement > D)
             left = mid + 1;
           else
             right = mid;
       }
       return left;
   }
};