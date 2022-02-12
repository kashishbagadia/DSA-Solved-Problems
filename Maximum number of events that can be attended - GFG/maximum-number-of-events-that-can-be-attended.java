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
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static class pair{
       int s;
       int e;
       pair(int s,int e){
           this.s=s;
           this.e=e;
       }
   }
    static int maxEvents(int[] start, int[] end, int N) {
       // code here
   
       pair[] arr = new pair[N];
       for(int i=0;i<N;i++){
           arr[i]=new pair(start[i],end[i]);
       }
       Arrays.sort(arr,(a,b)->(a.s-b.s));
       Arrays.sort(arr,(a,b)->(a.s-b.s));
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
      int i = 0, ans = 0, d = 0;
       while (!pq.isEmpty() || i < N) {
           if (pq.isEmpty())
               d = arr[i].s;
           while (i < N && arr[i].s <= d)
               pq.offer(arr[i++].e);
           pq.poll();
           ++ans; ++d;
           while (!pq.isEmpty() && pq.peek() < d)
               pq.poll();
       }
       return ans;
   }
};