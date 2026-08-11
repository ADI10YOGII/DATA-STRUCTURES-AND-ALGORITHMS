package leet.Strings;

import java.util.Arrays;

public class Anagram 
{
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) 
	{
		String s1="anagram";
		String s2="nagaram";
		
		System.out.println(isAnagram(s1,s2));
		

	}

}
