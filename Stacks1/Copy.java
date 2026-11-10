package leet.Stacks;

import java.util.Stack;

public class Copy 
{

	public static void main(String[] args) 
	{
		
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		Stack<Integer> rt=new Stack<>();
		System.out.println();
		while(st.size()>0)
		{
			int x=st.pop();
			rt.push(x);
		}
		System.out.println(rt);
		System.out.println();
		Stack<Integer> ft=new Stack<>();
		while(rt.size()>0)
		{
			ft.push(rt.pop());
		}
		System.out.println(ft);
		System.out.println();
		
		

	}

}
