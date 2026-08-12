package leet.Strings;

public class Compression2 
{
	class Solution 
	{
	    public int compress(char[] arr) 
	    {
	        String ans="";
			
			int i=0,j=0;
			while(j<arr.length)
			{
				if(arr[j]==arr[i])
					j++;
				else
				{
					ans+=arr[i];
					
					int len=j-i;
					if(len>1)
					{
						ans+=len;
					}
					i=j;
					
				}
			}
			ans+=arr[i];
			int len=j-i;
			if(len>1)
			{
				ans+=len;
				
			}
			
			//The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

//After you are done modifying the input array, return the new length of the array.
	        for(i=0;i<ans.length();i++)
	        {
	            arr[i]=ans.charAt(i);
	        }

	        return ans.length();
	        
	    }
	}

}
