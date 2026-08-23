package leet.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class NumbersDissapeared 
{

		public static void swap(int i,int j,int[] nums)
		{
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}
		public static List<Integer> findDisappearedNumbers(int[] nums)
		{
			int n=nums.length;
			int i=0;
			
			while(i<n)
			{
				int ele=nums[i];
				if(nums[i]==i+1||nums[i]==nums[ele-1])
					i++;
				else
				{
					swap(i,ele-1,nums);
			    }
		   }
		List<Integer> ans=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			if(nums[i]!=i+1)
				ans.add(i+1);
		}
		return ans;
	   }
	   
		public static void main(String[] args)
		{
			int n[]= {4,3,2,7,8,2,3,7};
			System.out.println(findDisappearedNumbers(n));
		}

}
