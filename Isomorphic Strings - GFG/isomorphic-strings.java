// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        int cnt1[] = new int[256];
        int cnt2[] = new int[256];
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        for(int i = 0; i < str1.length(); i++){
            cnt1[str1.charAt(i)]++;
            cnt2[str2.charAt(i)]++;
        }
        
        for(int j = 0; j < str1.length(); j++){
            if(cnt1[str1.charAt(j)] == cnt2[str2.charAt(j)]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}