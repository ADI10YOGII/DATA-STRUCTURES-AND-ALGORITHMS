package leet.CyclicSort;

public class Missing 
{
	public static int missingNumber(int[] nums)
	{
		int n=nums.length;
		boolean[] b=new boolean[n+1];//We have taken an extra space.
		
		for(int ele:nums)
		{
			b[ele]=true;
		}
		for(int i=0;i<=n;i++)
		{
			if(b[i]==false)
				return i;
		}
		return 555;
	}

	public static void main(String[] args) 
	{
		int[] n= {1,6,4,7,0,5,2};
		System.out.println(missingNumber(n));
			
		// TODO Auto-generated method stub

	}

}
