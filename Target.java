package leet.Arrays;

public class Target 
{

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5,6,7};
		
		int n=arr.length;
		int target=8;
		
		boolean flag=false;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==target)
			{
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println(-1);
		}

	}

}
