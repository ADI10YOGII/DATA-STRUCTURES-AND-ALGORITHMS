package leet.Strings;
import java.util.*;

public class UpdateEven 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		String str="";
		
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			//More space and more time complexity
			
			if(i%2==0)
			{
				str+="a";
			}
			else
			{
				str+=s.charAt(i);
			}
		}
		
		System.out.println(str);
		sc.close();
		

	}

}
