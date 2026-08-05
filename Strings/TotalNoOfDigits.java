package leet.Strings;
import java.util.*;

public class TotalNoOfDigits 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
//		String s="";
//		
//		s+=n;
		
		
		String s=Integer.toString(n);
		int l=s.length();
		
		System.out.println(l);
		
		sc.close();
		
	

	}

}
