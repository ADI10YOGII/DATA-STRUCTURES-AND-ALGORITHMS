package leet.StringBuilder;
import java.util.*;
public class Sort 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(sc.nextLine());
		
		char[] ch=sb.toString().toCharArray();
		for(char ele:ch)
		{
			System.out.print(ele+" ");
		}
		
		Arrays.sort(ch);//sort on the basisi of ascii values
		
		System.out.println();
		
		for(char ele:ch)
		{
			System.out.print(ele+" ");
		}
		
		sc.close();
		
		

	}

}
