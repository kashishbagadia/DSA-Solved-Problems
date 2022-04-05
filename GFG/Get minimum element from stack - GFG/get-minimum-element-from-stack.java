// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    /*returns min element from stack*/
    int getMin()
    {
	    if(min.size() == 0) return -1;
	    return min.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	    if(s.size() == 0) return -1;
	    int e = s.pop();
	    if(e == min.peek()) min.pop();
	    return e;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	    s.push(x);
	    if(min.size() == 0 || min.peek() >= x) min.push(x);
    }	
}

