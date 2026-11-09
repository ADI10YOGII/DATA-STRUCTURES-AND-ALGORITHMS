package leet.Stacks;
import java.util.*;
public class BalancedBrackets 
{
	public static boolean isbalanced(String s)
	{
		int n=s.length();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<n;i++)
		{
			char ch=s.charAt(i);
			if(ch=='(')
			{
				st.push(ch);
				
			}
			else//ch==')'
			{
				if(st.size()==0)
				{
					return false;
				}
				if(st.peek()=='(')
				{
					st.pop();
				}	
			}
		}
		if(st.size()!=0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isbalanced(s));
		
		sc.close();
		

	}

}
