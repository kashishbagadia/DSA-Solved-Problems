// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                }
                else{
                    Node temp=new Node(a);
                    temp.next=head;
                    head=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
        if (head == null)
            return null;
         
        // Traverse the list from second node.
        Node temp = (head).next, prev = head;
        while (temp != null)
        {
         
            // If current node is 0, move to
            // beginning of linked list
            if (temp.data == 0)
            {
         
                // Disconnect node from its
                // current position
                Node curr = temp;
                temp = temp.next;
                prev.next = temp;
             
                // Move to beginning
                curr.next = (head);
                head = curr;
            }
         
            // For non-zero values
            else
            {
                prev = temp;
                temp = temp.next;
            }
             
        }
        return head;
        
    }
}