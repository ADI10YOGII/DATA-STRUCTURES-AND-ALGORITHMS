package leet.Stacks;
import java.util.*;
class MinStack2 
{
	Stack<Long> st=new Stack<>();
	long min=-1;
	  public MinStack2() 
	  {
	        
	    
	  }
	    
	    public void push(int value) 
	    {
	    	long x=(long)value;
	    	if(st.size()==0)
	    	{
	    		st.push(x);
	    		min=x;
	    	}
	    	else if(x>=min)
	    	{
	    	  st.push(x);
	    	}
	    	else
	    	{
	    		st.push(2*x-min);
	    		min=x;
	    	}
	        
	    }
	    
	    public void pop() 
	    {
	    	if(st.size()==0)
	    		return;
	    	else if(st.peek()>=min)
	    	{
	    		st.pop();
	    	}
	    	else
	    	{
	    		long old=2*min-st.peek();
	    		min=old;
	    		st.pop();
	    	}
	        
	    }
	    
	    public int top() 
	    {
	    	if(st.size()==0)
	    		return -1;
	    	long q=st.peek();
	    	if(st.peek()>=min)
	    	{
	    		return (int)q;
	    	}
	    	if(st.peek()<min)
	    	{
	    		return (int)min;
	    	}
	    	return 0;
	        
	    }
	    
	    public int getMin() 
	    {
	    	if(st.size()==0)
	    		return -1;
	    	
	    	return (int)min;
	        
	    }
}
public class GetMin2
{
	public static void main(String[] args)
    {
        MinStack2 obj = new MinStack2();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top Element: " + obj.top());      // 2
        System.out.println("Minimum: " + obj.getMin());       // 2

        obj.pop();

        System.out.println("After Pop");
        System.out.println("Top Element: " + obj.top());      // 7
        System.out.println("Minimum: " + obj.getMin());       // 3

        obj.pop();

        System.out.println("After Pop");
        System.out.println("Top Element: " + obj.top());      // 3
        System.out.println("Minimum: " + obj.getMin());       // 3

        obj.push(1);

        System.out.println("After Push 1");
        System.out.println("Top Element: " + obj.top());      // 1
        System.out.println("Minimum: " + obj.getMin());       // 1
    }
}
