package leet.Reccursion;

import java.util.Scanner;

public class CountAndSay 
{
	public static String Count(int n)
	{
		if(n==1)
			return "1";
		
		
		String s=Count(n-1);
		
		String ans="";
		int i=0;
		int j=0;
		while(j<s.length())
		{
			if(s.charAt(i)==s.charAt(j))
			{
				j++;
			}
			else
			{
				int len=j-i;
				ans+=len;
				ans+=s.charAt(i);
				i=j;
			}
		}
		
		int len=j-i;
		ans+=len;
		ans+=s.charAt(i);
		return ans;
		
	}
	

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Count(n));
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
