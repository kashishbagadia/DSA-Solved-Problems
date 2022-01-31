// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} class GfG {
    public static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    
    public static Node point(Node root, int n)
    {
        if(root == null)
            return null;
            
        if(root.data == n)
            return root;
            
        Node l = point(root.left, n);
        if(l!=null && l.data==n)
            return l;
            
        Node r= point(root.right, n);
        return r;
        
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            Node root = buildTree(s);
            
            Node p = point(root,n);
            
            Solution ob=new Solution();
            ArrayList<Integer> ans= ob.printCousins(root, p);
            
            for(int i=0;i<ans.size();i++)
            {
                    System.out.print(ans.get(i)+" ");
    
            }
            
            System.out.println();
            
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution{
    
    static class Pair{
        Node par;
        int depth;
        Pair(Node par, int depth){
            this.par = par;
            this.depth = depth;
        }
    }
    
    static Pair getPar(Node root,int depth, Node toFind, Node par){
        if(root==null) return new Pair(null,-1);
        if(root==toFind) return new Pair(par,depth);
        Pair left = getPar(root.left, depth+1,toFind,root);
        if(left.par != null) return left;
        return getPar(root.right, depth+1,toFind,root);
    }
    
    static void solve(Node root, int myDepth, int reqDepth, Node par, ArrayList<Integer> list){
        if(root==null || root==par || myDepth>reqDepth) return;
        if(myDepth==reqDepth){
            list.add(root.data);
            return;
        }
        solve(root.left,myDepth+1,reqDepth,par,list);
        solve(root.right,myDepth+1,reqDepth,par,list);
    }
    
    public static ArrayList<Integer> printCousins(Node root, Node node_to_find){
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root==node_to_find){
            list.add(-1);
            return list;
        }
        Pair par = getPar(root,0,node_to_find,null);
        solve(root,0,par.depth,par.par,list);
        if(list.size()==0) list.add(-1);
        return list;
    }
}