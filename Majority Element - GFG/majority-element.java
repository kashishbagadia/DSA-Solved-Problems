// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
   static int majorityElement(int a[], int size)
   {
       // using hashmap
       HashMap<Integer, Integer> map = new HashMap<>();
       int majority;
       //iterate through the array
       for(int i =0; i< size; i++){
           //return if size of array == 1
           if(size == 1){
               majority = a[i];
               return majority;
           }
           //check if key already exist in map
           if (map.containsKey(a[i])){
               int value = map.get(a[i]) + 1; //check value of every key
               map.put(a[i], value);
               if(value == size/2){
                   majority = a[i];
                   return majority;
               }
           }else{
               //Adding if key doesn't exist
               map.put(a[i], 0);
           }
       }
       return -1;
   }
}