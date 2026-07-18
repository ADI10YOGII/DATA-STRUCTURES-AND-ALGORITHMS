package leet.Arrays;

public class Prior 
{
	public static int prior(int arr[])
	{
		int n=arr.length;
		int c=0;
		int mx=Integer.MIN_VALUE;	
		for(int i=0;i<n;i++)
		{
			if(arr[i]>mx)
			{
				c++;	
				mx=arr[i];
			}
		}
		return c;
	}

	public static void main(String[] args) 
	{
		
		//int[] arr= {7,4,8,2,9};
		//int[] arr= {3,4,5,8,9};
		
		
		int[] arr= {10,1,2,3};
		
		System.out.println(prior(arr));		// TODO Auto-generated method stub

	}

}
