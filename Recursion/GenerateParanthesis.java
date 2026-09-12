package leet.Reccursion;

import java.util.Scanner;

public class GenerateParanthesis 
{
	public static void print(int open,int closed,int n,String s)
	{
		if(s.length()==2*n)
		{
			System.out.println(s);
			return ;
		}
		
		if(open<n)
			print(open+1,closed,n,s+"(");
		if(closed<open)
			print(open,closed+1,n,s+")");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		print(0,0,n,"");
		sc.close();
		// TODO Auto-generated method stub

	}

}
