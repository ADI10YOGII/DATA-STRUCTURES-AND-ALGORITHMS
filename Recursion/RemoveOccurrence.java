package leet.Reccursion;

public class RemoveOccurrence 
{
	public static void remove(int i,String ans,String n)
	{
		if(i==n.length())
		{
			System.out.print(ans);
			return;
		}
		
		
		
		if(n.charAt(i)!='a')
		{
		   ans+=n.charAt(i);
		}
		
		
		
		remove(i+1,ans,n);
		
		
	}

	public static void main(String[] args) 
	{
		
		String n="Aditya";
		
		remove(0,"",n);
		// TODO Auto-generated method stub

	}

}
