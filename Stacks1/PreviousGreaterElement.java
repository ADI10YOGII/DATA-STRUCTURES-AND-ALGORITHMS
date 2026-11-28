package leet.Stacks;

import java.util.Stack;

public class PreviousGreaterElement 
{

	public static void main(String[] args) 
	{
		Stack<Integer> st=new Stack<>();
		int[] arr=  {1,3,2,1,8,6,3,4};
		int n=arr.length;
		int[] res=new int[n];
		
		res[0]=-1;
		st.push(arr[0]);
		
		for(int i=1;i<n;i++)
		{
			while(st.size()>0&&st.peek()<=arr[i])
			{
				st.pop();
			}
			if(st.size()==0)
			{
				res[i]=-1;
			}
			else
			{
				res[i]=st.peek();
			}
			st.push(arr[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
