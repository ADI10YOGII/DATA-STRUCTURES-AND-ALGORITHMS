package leet.Reccursion;
import java.util.*;

public class LogPow 
{
	public static int pow(int a,int b)
	{
		if(b==0)
			return 1;
		int p=pow(a,b/2);
		if(b%2==0)
			return p*p;
		else
			return p*p*a;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(pow(a,b));
		// TODO Auto-generated method stub
         sc.close();
	}

}
