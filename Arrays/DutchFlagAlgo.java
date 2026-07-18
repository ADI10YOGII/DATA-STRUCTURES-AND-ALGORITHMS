package leet.Arrays;

public class DutchFlagAlgo 
{
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void print(int[] arr)
	{
		
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {0,1,2,0,1,2,1,2,0,0};
		int n=arr.length;
		print(arr);
		
		int lo=0,mid=0,hi=n-1;
		
		while(mid<=hi)
		{
			if(arr[mid]==0)
			{
				swap(arr,mid,lo);
				lo++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else 
			{
				swap(arr,mid,hi);
				hi--;
				
			}
		}
		
		System.out.println();
		print(arr);
		
		// TODO Auto-generated method stub

	}

}
