package leet.Reccursion;

public class StringSubsets 
{
	public static void printsubsets(int i,String s,String ans)
	{
		if(i==s.length())
		{
			System.out.println(ans);
			return;
		}
		
		printsubsets(i+1,s,ans);//skip
		char ch=s.charAt(i);
		printsubsets(i+1,s,ans+ch);//take
		
		
		
	}

	public static void main(String[] args) 
	{
		String s="abcd";
		
		printsubsets(0,s,"");
		// TODO Auto-generated method stub

	}

}
