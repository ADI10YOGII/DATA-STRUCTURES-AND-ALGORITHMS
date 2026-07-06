package leet.Arrays;

public class Reverse1 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7};
		int n=arr.length;
		//Printing the original array
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(); //Next Line
		
		
		
		//Reversing the array
		for(int i=0;i<n/2;i++)
		{
			int j=n-1-i;
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		
		//Printing the reversed Array
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
