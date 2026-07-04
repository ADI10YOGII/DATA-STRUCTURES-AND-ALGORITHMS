package leet.Arrays;
import java.util.*;

public class TwoSum 
{

	public static void main(String [] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		
		int t=sc.nextInt();
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int [] nums=twoSum(arr,t);
		if(nums[0]!=-1)
		{
		
			for(int i=0;i<2;i++)
			{
				System.out.print(nums[i]+" ");
			}
		}
		else
		{
			System.out.println("No solution found");
		}
		sc.close();
			
		
	}
		
		    public static int[] twoSum(int[] nums, int target) 
		    {
		        int [] arr= {-1,-1};
		        int n=nums.length;
		        for(int i=0;i<n;i++)
		        {
		            boolean flag=false;//optimizations
		            for(int j=i+1;j<n;j++)
		            {
		                if(nums[i]+nums[j]==target)
		                {
		                    arr[0]=i;
		                    arr[1]=j;

		                    flag=true;//optimizations
		                    break;//optimizations
		                }
		  
		            }
		            if(flag==true)//optimizations
		            break;
		        }

		        return arr;
		        
		    }	
}
