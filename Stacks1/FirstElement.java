package leet.Stacks;

import java.util.Stack;

public class FirstElement 
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
		
		while(st.size()>1)
		{
			st.pop();
		}
		System.out.println(st.peek());
		System.out.println(st);
		//Problem is original stack got removed.
		//o(n)
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		//To access second element
		while(st.size()>2)
		{
			st.pop();
		}
		System.out.println(st.peek());
        System.out.println(st);

	}

}
