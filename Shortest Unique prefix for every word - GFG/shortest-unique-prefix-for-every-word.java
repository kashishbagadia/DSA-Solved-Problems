// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String arr[] = read.readLine().split(" ");

            Solution ob = new Solution();
            String[] res = ob.findPrefixes(arr,N);
            
            for(int i=0; i<res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String[] findPrefixes(String[] arr, int N) {
        
        Trie trie = new Trie();
        for(String str : arr){
            trie.insert(str);
        }
        
        String [] ans = new String[N];
        for(int i=0; i< N ;i++){
            ans[i] = trie.pref(arr[i]);
        }
        
        return ans;
    }
};

class Node{
    
    Node []links;
    boolean f;
    
    Node (){
        links = new Node[26];
        f = false;
    }
}

class Trie{
    
    private final Node root ;
    Trie(){
        root = new Node();
    }
    
    void insert( String word){
        Node node = root;
        for(int i=0; i< word.length(); i++ ) {
            int ch = word.charAt(i) - 'a' ;
            
            if( node.links[ch] == null ){
                node.links[ch] = new Node();
            }
            else{
                node.links[ch].f = true;
            }
            node = node.links[ch];
        }
    }
    
    String pref( String word){
        Node node= root;
        
        for(int i=0; i< word.length(); i++){
            int ch = word.charAt(i) - 'a';
            
            node=node.links[ch];
            if(node.f == false){
                return word.substring(0 , i+1);
            }
        }
        
        return word;
    }
    
}