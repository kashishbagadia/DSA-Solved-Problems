// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findK(int[] arr,int l,int r,int key){
        if(r>=l){
            int mid=l+((r-l)/2);
            if(arr[mid]==key)
                return mid;
            if(arr[mid]>key)
                return findK(arr,l,mid-1,key);
            return findK(arr,mid+1,r,key);
        }
        return l;
    }
    
    static int searchInsertK(int Arr[], int N, int k)
    {
        int x=findK(Arr,0,N-1,k);
        return x;
    }
}