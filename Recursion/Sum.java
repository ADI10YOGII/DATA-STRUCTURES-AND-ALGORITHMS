package leet.Reccursion;
import java.util.*;
public class Sum 
{
	public static int sum1(int n,int s)
	{
		if(n==0||n==1)
			return n;
		
		
		return n+sum1(n-1,s);
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(sum1(n,0));
		// TODO Auto-generated method stub
        sc.close();
	}

}
