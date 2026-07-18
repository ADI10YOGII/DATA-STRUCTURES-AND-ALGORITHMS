package leet.Arrays;

public class Maximumnumber2 {

	public static void main(String[] args) 
	{
		
		int [] arr= {-1,-2,-3,-4,-5,-6,-7};
		int n=arr.length;
		
		int mx=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			mx=Math.max(mx, arr[i]);
			
		}
		
		System.out.println(mx);
		// TODO Auto-generated method stub

	}

}
