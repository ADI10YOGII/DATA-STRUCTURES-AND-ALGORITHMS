package leet.Stacks;

import java.util.Stack;

public class DisplayStack 
{
	public static void displayRec(Stack<Integer> st)
	{
		if(st.size()==0)
		{
			return;
		}
		int x=st.pop();
		displayRec(st);
		System.out.print(x+" ");
		st.push(x);
	}
	public static void displayRevRec(Stack<Integer> st)
	{
		if(st.size()==0)
		{
			return;
		}
		int x=st.pop();
		System.out.print(x+" ");
		displayRevRec(st);
		st.push(x);
	}
	public static void main(String[] args) 
	{

		
		Stack<Integer> st=new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		
		//With the help of stack
		Stack<Integer> rt=new Stack<>();
		while(st.size()>0)//zero based indexing
		{
			int x=st.pop();
			rt.push(x);
		}
		while(rt.size()>0)
		{
			int x=rt.pop();
			System.out.print(x+" ");
			st.push(x);
		}
		System.out.println();
		
		
		//With the help of Array
		
		int n=st.size();
		int[] arr=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			arr[i]=st.pop();
		}
		for(int i=0;i<n;i++)
		{
			st.push(arr[i]);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Recursively
		displayRec(st);
		System.out.println();
		displayRevRec(st);
		
	}

}
