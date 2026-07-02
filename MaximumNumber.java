package leet.Arrays;

public class MaximumNumber 
{

	public static void main(String[] args) 
	{
		
		int [] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		
		int mx=arr[0];// fails for negative number.
		
		for(int i=0;i<n;i++)
		{
			mx=Math.max(mx, arr[i]);
			
		}
		
		System.out.println(mx);
		// TODO Auto-generated method stub

	}

}
