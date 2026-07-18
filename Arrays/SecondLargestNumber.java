package leet.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) 
	{
		int [] arr= {-1,-2,-3,-4,-5,-6,-7};
		int n=arr.length;
		
		int mx=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			mx=Math.max(mx, arr[i]);
			
		}
		
		int smx=Integer.MIN_VALUE;
		
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=mx)
			{
				smx=Math.max(smx, arr[i]);
			}
		}
		
		System.out.println(smx);
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}
