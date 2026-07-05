package leet.Arrays;

public class Sort2 
{
	public static void print(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int[] arr)
	{
		int n=arr.length;
		int noOfZeros=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				noOfZeros++;

		}
		for(int i=0;i<noOfZeros;i++)
		{
			arr[i]=0;
		}
		for(int i=noOfZeros;i<n;i++)
		{
			arr[i]=1;
		}	
		
	}
	public static void main(String[] args)
	{
		int[] arr= {0,1,1,1,0,1,0,1,0,1,1,0,0};
		//System.out.print(arr);//Prints the address
		print(arr);
		
		
		System.out.println();
		
		sort(arr);
		print(arr);
	}

}
