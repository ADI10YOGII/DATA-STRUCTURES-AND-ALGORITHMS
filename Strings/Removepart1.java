package leet.Strings;

public class Removepart1 
{
	public static String remove(String a,String b)
	{
		int l=b.length();
		int l2=a.length();
		int j=0;
		String s="";
		
		for(int i=0;i<l;i++) 
		{

			char ch=b.charAt(i);
		

				if(j<l2&&ch==a.charAt(j))
				{
					j++;
				}
				else
				{
				
					s=s+ch;	
				}
			
			
		}
		return s;
		
	}

	public static void main(String[] args) 
	{
		String a="gaya";
		String b="gayatri";
		
		System.out.println(remove(a,b));
		// TODO Auto-generated method stub

	}

}
