package leet.StringBuilder;

public class ReverseWords2 
{
	    public static void reverse1(StringBuilder sb,int i,int j)
		{
			while(i<=j)
			{
				char temp=sb.charAt(i);
				sb.setCharAt(i, sb.charAt(j));
				sb.setCharAt(j,temp);
				
				i++;
				j--;
				
			}
		}

	    public static  String reverseWords(String s) 
	    {
	        s = s.trim().replaceAll("\\s+", " ");
	        StringBuilder sb=new StringBuilder(s);
	        sb=sb.reverse();
			
			int l=sb.length();
			int i=0,j=0;
			
			while(j<l)
			{
				if(sb.charAt(j)!=' ')
				{
					j++;
				}
				else
				{
					reverse1(sb,i,j-1);
					i=j+1;
					j=i;
				}
			}
			reverse1(sb,i,j-1);
			return sb.toString();
	        
	    }
	    public static void main(String[] args) 
	    {

	        String s="hi hello   how are yoy";

	        System.out.println(reverseWords(s));

	        
	    }
}
