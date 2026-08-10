package leet.Strings;

public class Frequency 
{

	public static void main(String[] args) 
	{
		String s="aabbbcdeeeef";
		
		int l=s.length();
		
		int[] freq=new int[26];
		
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			
			int idx=(int)ch-97;
			freq[idx]++;
		}
		
		int mx=-1;
		
		for(int i=0;i<freq.length;i++)
		{
			mx=Math.max(mx, freq[i]);	
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(mx==freq[i])
			{
				char ch=(char)(i+97);
				System.out.print(ch);
			}
		}
	}

}
