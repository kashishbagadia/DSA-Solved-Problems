// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i=0; i<n; i++)
                        {
                            int x = sc.nextInt();
                            arr.add(x);
                        }
                    int k = sc.nextInt();
                    
                    Solution obj = new Solution();
                    res = obj.TopK(arr,k);
                    
                    for(int i=0; i<res.size();i++)
                        {
                            System.out.print(res.get(i) + " ");
                        }
                    System.out.println();    
                    
                        
                }
        }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer>TopK(ArrayList<Integer> array, int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:array)
        {
            hm.putIfAbsent(a,0);
            hm.put(a,hm.get(a)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(new MIN());
        for(Map.Entry m:hm.entrySet())
        {
            int key=(int)m.getKey();
            int value=(int)m.getValue();
            pq.add(new Pair(key,value));
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<k;i++)
        ans.add(pq.poll().first);
        
        return ans;
    }
    static class Pair
    {
        int first,sec;
        Pair(int a,int b)
        {
            first=a;
            sec=b;
        }
    }
    static class MIN implements Comparator<Pair>
    {
        public int compare(Pair a, Pair b)
        {
            if(a.sec>b.sec)
            return -1;
            else if(a.sec<b.sec)
            return 1;
            else
            {
                if(a.first>b.first)
                return -1;
                else if(a.first<b.first)
                return 1;
                else 
                return 0;
            }
        }
    }
}
