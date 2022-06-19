// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.io.*;
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class insertion
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])throws IOException
    {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
		 int t=Integer.parseInt(br.readLine());
		 while(t>0)
         {
            String S[] = br.readLine().split(" ");
			int N = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int n = Integer.parseInt(S[2]);
		
		    String S1[] = br.readLine().split(" ");
			insertion llist = new insertion(); 
			int a1=Integer.parseInt(S1[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = Integer.parseInt(S1[i]);
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		Node newhead=ob.reverseBetween(llist.head, m, n);
		llist.printList(newhead);
		
        t--;		
        }
    }}// } Driver Code Ends


//User function Template for Java

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
class Solution
{
   public static Node reverseBetween(Node head, int m, int n)
   {
       //code here
       Node temp1 = new Node(-1);
       
       temp1.next = head;
       Node dummy = temp1;
       Node temp = head;
       
       while (m>1){
           temp = temp.next;
           temp1 = temp1.next;
           m--;
           n--;
       }
       
       temp1.next = null;
       Node reversingNode = temp;
       
       
       while (n>1){
           temp = temp.next;
           n--;
       }
       Node next = temp.next;
       if (temp!=null){
       temp.next = null;
       }
       
       
       Node mid =  reverse(reversingNode);
       
       temp = mid;
       while (temp.next!=null){
           temp = temp.next;
       }
       temp.next = next;
       
       temp = dummy;
       while (temp.next!=null){
           temp = temp.next;
           
       }
       temp.next = mid;
       
       return dummy.next;
       
   }
   public static Node reverse(Node head){
       if (head==null){
           return head;
       }
       Node curr = head;
       Node prev = null;
       Node next = curr.next;
       
       while (curr!=null){
           curr.next = prev;
           prev = curr;
           curr = next;
           if (next!=null){
               next = next.next;
           }
       }
       return prev;
   }
}