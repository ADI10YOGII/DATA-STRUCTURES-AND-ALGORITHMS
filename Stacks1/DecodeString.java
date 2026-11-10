package leet.Stacks;
import java.util.*;

public class DecodeString 
{
	public static String decode(String s)
	{
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=']')
			{
				st.push(ch);
			}
			else
			{
				StringBuilder sb=new StringBuilder();
				
				while(st.peek()!='[')
				{
					sb.append(st.pop());
				}
				
				st.pop();
				
				int k=0;
				int base=1;
				
				while(st.size()>0&&Character.isDigit(st.peek()))
				{
					k=(st.pop()-'0')*base+k;
					base=base*10;
				}
				while(k-->0)
				{
					for(int j=sb.length()-1;j>=0;j--)
					{
						st.push(sb.charAt(j));
						
					}
				}
			}
		}
				
				char[] result=new char[st.size()];
				
				for(int i=st.size()-1;i>=0;i--)
				{
					result[i]=st.pop();
					
			    }
				return new String(result);
	}

	public static void main(String[] args) 
	{
		
		

	}

}
