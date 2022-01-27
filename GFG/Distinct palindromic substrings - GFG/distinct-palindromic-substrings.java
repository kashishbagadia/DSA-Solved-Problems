// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str = read.readLine().trim(); 
            Solution obj = new Solution();
            int ans = obj.palindromeSubStrs(str);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static HashSet<String> hash = new HashSet<>();
    static boolean palin(String s, int low, int high){
        int n = high - low + 1;
        if(n==1)return true;
        for(int i = 0; i < n/2; i++){
            if(s.charAt(low+i)!=s.charAt(high-i)) return false;
        }
        return true;
    }
    int palindromeSubStrs(String str) { 
        hash.clear();
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                if(palin(str, i, j)) 
                hash.add(str.substring(i,j+1));
            }
        }
        return hash.size();
    }
} 