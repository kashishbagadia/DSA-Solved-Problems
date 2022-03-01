// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int X = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            int numbers[]= new int[N];
            for(int i = 0; i < N; i++)
                numbers[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.countPairs(N, X, numbers); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    public static long countPairs(int N, int X, int numbers[]) 
    {   
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        String target = String.valueOf(X);
        int n = target.length();
        
        for(int i=0; i<N; i++){
            map.put( numbers[i] , map.getOrDefault( numbers[i],0 )+1 );
        }
        
        
        long count = 0;
        for(int x: map.keySet() ){
            String s1 = String.valueOf(x);
            int cnt = map.get(x);
            int n1 = s1.length();
            int j=0;
            
            while(j<n1 && j<n && s1.charAt(j)==target.charAt(j) ) 
                j++;
            
            if( j==0 || j!=n1 || j==n)
                continue;
            
            String rem = target.substring(j);
            if(rem.charAt(0) == '0' )
                continue;
                
            if( s1.equals(rem)== false )
                count += map.getOrDefault( Integer.parseInt(rem), 0 )*cnt;
            else
                count += cnt*(cnt-1);
        }
        return count;
    }
} 