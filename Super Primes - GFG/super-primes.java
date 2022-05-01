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
            int n = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.superPrimes(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
   int superPrimes(int n) {
       // code here
       if(n<=4){
           return 0;
       }
       int count=0;
       ArrayList<Integer> a=new ArrayList<Integer>();
       a.add(2);
       a.add(3);
       for(int i=5;i<=n;i++){
           if(prime(i)){
               if(!a.isEmpty() && a.contains(i-a.get(a.size()-1))){
                   count++;
               } 
               a.add(i);
           }
       }
       return count;
   }
   boolean prime(int n){
       for(int i=2;i*i<=n;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
   }
}