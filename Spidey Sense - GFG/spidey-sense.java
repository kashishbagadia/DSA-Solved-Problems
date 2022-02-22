// { Driver Code Starts
import java.util.*;
import java.math.*;

class Pair{
    
    int x,y;
    Pair(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            int m = Integer.parseInt(sc.next());
            int n = Integer.parseInt(sc.next());
            char mat[][] = new char[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    mat[i][j] = sc.next().charAt(0);
                }
            }
           
            Solution T = new Solution();
            int ans[][] = T.findDistance(mat, m, n);
            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    public static int[][] findDistance(char mat[][], int m,int n)
    {
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]=='W')
                    matrix[i][j]=-1;
                else
                    matrix[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]=='B')
                    dfs(mat,matrix,i,j);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]=='O' && matrix[i][j]==Integer.MAX_VALUE)
                    matrix[i][j]=-1;//if there is any 'O' where 'Bomb can't enter, replace it with -1
            }
        }
        
        return matrix;
    }
    public static void dfs(char mat[][],int matrix[][],int i,int j)
    {
        int dx[]={0,0,-1,1};
        int dy[]={-1,1,0,0};
        matrix[i][j]=0;
        
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{i,j});
        while(!q.isEmpty())
        {
            
            int p[]=q.poll();
            for(int kk=0;kk<4;kk++)
            {
                int x=p[0]+dx[kk];
                int y=p[1]+dy[kk];
                if(x<0 || y<0 || x>=mat.length || y>=mat[0].length || mat[x][y]=='W')
                    continue;
                
                if(mat[x][y]=='O')
                {
                    if(matrix[x][y]>matrix[p[0]][p[1]])
                    {
                        
                        q.offer(new int[]{x,y});
                        matrix[x][y]=matrix[p[0]][p[1]]+1;
                    }
                    
                }
                
            }
        }
    }
}