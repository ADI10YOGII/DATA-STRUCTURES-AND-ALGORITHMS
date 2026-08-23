package leet.CyclicSort;

public class Duplicate 
{
	public static void swap(int i,int j,int[] nums)
	{
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	public static int findDuplicate(int[] nums)
	{
		while(true)
		{
			int ele=nums[0];
			
			if(nums[ele]==ele)
				return ele;
			
			
			swap(0,ele,nums);
		}
	}

	public static void main(String[] args) 
	{
		int n[]= {1,3,4,2,2};
		System.out.println(findDuplicate(n));
		
		// TODO Auto-generated method stub

	}

}
