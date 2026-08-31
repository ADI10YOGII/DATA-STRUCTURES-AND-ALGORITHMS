package leet.Reccursion;


public class Traverse1 
{
	public static void print(int i,int [] nums)
	{
		if(i==nums.length)
			return;

			System.out.print(nums[i]+" ");
			
			print(i+1,nums);
	
		
	}

	public static void main(String[] args) 
	{
		int[] nums= {4,5,3,5,6,7,8};
		
		print(0,nums);
		
		// TODO Auto-generated method stub

	}

}
