package leet.Strings;

public class Maximum2 
{
	public static String purify(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='0')
			{
				return s.substring(i);
			}
		}
		return s;
	}
	public static String max(String a,String b)
	{
		String s=purify(a);
		String t=purify(b);
		
		if(s.length()>t.length())
			return a;
		if(s.length()<t.length())
			return b;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=t.charAt(i))
			{
				if(s.charAt(i)>t.charAt(i))
					return a;
				else
					return b;
			}
		}
		
		// Same numeric value; keep the one with more leading zeros.
		if(a.length()>=b.length())
			return a;
		else
			return b;	
	}

	public static void main(String[] args) 
	{
		String[] arr= {"00000123","455","746745","56354","0025"};
		
		String maxNo=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			String n=arr[i];
			maxNo=max(maxNo,n);
		}
		System.out.println(maxNo);
	

	}

}
