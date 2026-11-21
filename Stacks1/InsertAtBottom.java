package leet.Stacks;

import java.util.Stack;

public class InsertAtBottom 
{

	public static void main(String[] args) 
	{
		int n=60;
		
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		Stack<Integer> rt=new Stack<>();
		while(st.size()>0)
		{
			int x=st.pop();
			rt.push(x);
		}
		System.out.println(rt);
		
		st.push(n);
		while(rt.size()>0)
		{
			st.push(rt.pop());
		}
		System.out.println(st);

	}

}
