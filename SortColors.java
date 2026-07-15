package leet.Arrays;

public class SortColors 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,1,0,1,2,2,0,0,2,0};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println();
		
		
		int noOfzeros=0,noOfOnes=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				noOfzeros++;
			if(arr[i]==1)
				noOfOnes++;	
		}
		
		for(int i=0;i<n;i++)
		{
			if(i<noOfzeros)
				arr[i]=0;
			else if(i<noOfzeros+noOfOnes)
				arr[i]=1;
			else
				arr[i]=2;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
