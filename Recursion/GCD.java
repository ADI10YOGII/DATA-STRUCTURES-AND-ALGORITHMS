package leet.Reccursion;

import java.util.Scanner;

public class GCD 
{
	public static int gcd(int a,int b)
	{
		if(b%a==0)
			return a;
		
		return gcd(b%a,a);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(gcd(a,b));
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
