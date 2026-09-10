package leet.Reccursion;
import java.util.*;

public class OneToN 
{
	public static void print1(int n,int x)
	{
		if(x>n)
			return;
		
		System.out.print(x);
		print1(n,x+1);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		print1(n,1);
		
		sc.close();
		// TODO Auto-generated method stub

	}
	

}
