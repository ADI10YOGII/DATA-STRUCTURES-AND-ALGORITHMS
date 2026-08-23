package leet.CyclicSort;

public class Missing3 
{

	public static void main(String[] args) 
	{
		int[] nums= {1,6,4,7,0,5,2};
		
		int n=nums.length;
		int s=(n*(n+1))/2;
		
		int sum=0;
		for(int ele:nums)
		{
			sum+=ele;
		}
		
		System.out.println("Missing number is: "+(s-sum));
		// TODO Auto-generated method stub

	}

}
