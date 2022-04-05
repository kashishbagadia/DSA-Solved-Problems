// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.previousNumber(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String previousNumber(String s){
       int n=s.length();
       int largest=n-2;
       while(largest>=0&&(s.charAt(largest)-'0')<=(s.charAt(largest+1)-'0')) largest--;
       if(largest<0) return "-1";
       int smallest=n-1;
       while(smallest>largest&&(s.charAt(smallest)-'0')>=(s.charAt(largest)-'0')) smallest--;
       while(smallest>0&&(s.charAt(smallest)-'0')==(s.charAt(smallest-1)-'0')) smallest--;
       List<Character> ls=new LinkedList<>();
       for(int i=0;i<n;i++) ls.add(s.charAt(i));
       Collections.swap(ls,largest,smallest);
       String st=ls
       .toString()
       .replace(", ","")
       .replace("]","")
       .replace("[","");
       if((st.charAt(0)-'0')==0) return "-1";
       return st;
    }
}