package leet.Strings;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) 
	{
		String s="aditya";
		
		char[] ch=s.toCharArray();
		
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
		
		

	}

}
