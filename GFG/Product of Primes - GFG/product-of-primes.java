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
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
   static long primeProduct(long L, long R){
       long output = 1;
       for(long i=L;i<=R;i++){
           if(isPrime(i)){
              // System.out.println(i);
        output = (output*i)%1000000007;
           }
       }
       
       return output;
   }
   static boolean isPrime(long n)
   {
       if (n <= 1)
           return false;
       else if (n == 2)
           return true;
       else if (n % 2 == 0)
           return false;

       for (long i = 3; i <= Math.sqrt(n); i =i+2)
       {
           if (n % i == 0)
               return false;
       }
       return true;
   }
}