package leet.Reccursion;
import  java.util.*;

public class StairPath 
{
	public static int stairs(int n)
	{
		if(n==1||n==2)
			return n;
		return stairs(n-1)+stairs(n-2);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(stairs(n));
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}

