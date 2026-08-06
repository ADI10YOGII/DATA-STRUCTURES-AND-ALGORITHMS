package leet.Strings;

public class Substrings 
{

	public static void main(String[] args) 
	{
		String s="abcde";
		
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<=l;j++)
			{
				System.out.print(s.substring(i, j)+" ");
			
			}
			
		}

	}

}
