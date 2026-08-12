package leet.Strings;

public class DeleteDuplicate {

	public static void main(String[] args) 
	{
		String s="aaaaabbbccdeeff";
		
		char[] arr=s.toCharArray();
		String ans="";
		
		int i=0,j=0;
		while(j<arr.length)
		{
			if(arr[j]==arr[i])
				j++;
			else
			{
				ans+=arr[i];
				i=j;
				
			}
		}
		ans+=arr[i];
		System.out.println(ans);
		
		// TODO Auto-generated method stub

	}

}
