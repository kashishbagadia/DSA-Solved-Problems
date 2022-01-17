// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        int start_x=KnightPos[0]-1, start_y=KnightPos[1]-1;
        int target_x=TargetPos[0]-1, target_y=TargetPos[1]-1;
        Queue<Pair> q=new LinkedList<>();
        boolean visited[][]=new boolean[N][N];
        q.add(new Pair(start_x,start_y));
        visited[start_x][start_y]=true;
        int count=0;
        int arr[][]={ {1,2},{-1,2},{2,1},{2,-1},{1,-2},{-1,-2},{-2,1},{-2,-1} };
        while(!q.isEmpty())
        {
            int z=q.size();
            for(int i=0;i<z;i++)
            {
                Pair p=q.poll();
                int x=p.first;
                int y=p.second;
                if(x==target_x && y==target_y)
                return count;
                
                for(int j=0;j<arr.length;j++)
                {
                    int x1=x+arr[j][0];
                    int y1=y+arr[j][1];
                    if(valid(x1,y1,N) && !visited[x1][y1])
                    {
                        visited[x1][y1]=true;
                        q.add(new Pair(x1,y1));
                    }
                }
            }
            count++;
        }
        return count;
    }
    static class Pair
    {
        int first;
        int second;
        Pair(int a,int b)
        {
            first=a;
            second=b;
        }
    }
    static boolean valid(int x,int y,int n)
    {
        if(x<n && x>=0 && y<n && y>=0)
        return true;
        
        return false;
    }
}