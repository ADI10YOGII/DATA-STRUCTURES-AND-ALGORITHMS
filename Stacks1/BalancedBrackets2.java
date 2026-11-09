package leet.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets2 
{
	public static boolean isbalanced(String s)
	{
	
		Stack<Character> st=new Stack<>();
		
			for(char ch:s.toCharArray())
			{
			if(ch=='(')
			{
				st.push(')');
				
			}
			else if(ch=='{')
			{
				st.push('}');
			}
			else if(ch=='[')
			{
				st.push(']');
			}
			else if(st.isEmpty()==true||st.pop()!=ch)
			{
				return false;
			}
	     }
	
		return st.isEmpty();
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isbalanced(s));
		
		sc.close();
		

	}

}
