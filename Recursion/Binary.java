package leet.Reccursion;
import java.util.*;
public class Binary 
{
	public static void bin(String s,int n)
	{
		int m=s.length();
		if(m==n)
		{
			System.out.println(s);
			return ;
		}
		
		if(m==0||s.charAt(m-1)=='0')
		{
			bin(s+0,n);
			bin(s+1,n);
			
		}
		else
		{
			bin(s+0,n);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		bin("",n);
		sc.close();
		// TODO Auto-generated method stub

	}

}
