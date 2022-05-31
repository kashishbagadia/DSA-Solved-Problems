// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	if(A.length()!=B.length()) return -1;
    	int arr[] = new int[256];
    	for(int i = 0; i < A.length(); i++){
    	    arr[A.charAt(i)]++;
    	    arr[B.charAt(i)]--;
    	}
    	for(int i = 0; i < 256; i++){
    	    if(arr[i]!=0) return -1;
    	}
    	int res = 0, p1 = A.length()-1, p2 = B.length()-1;
    	while(p1>=0){
    	    if(A.charAt(p1)!=B.charAt(p2)) res++;
    	    else p2--;
    	    p1--;
    	}
    	return res;
    }
}