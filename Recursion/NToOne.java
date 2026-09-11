package leet.Reccursion;

import java.util.Scanner;

public class NToOne 
{
	public static void print1(int n)
	{
		if(n<1)
			return;
		
		System.out.print(n);
		print1(n-1);
		
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		print1(n);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
