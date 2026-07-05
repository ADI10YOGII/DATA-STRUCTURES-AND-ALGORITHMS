package leet.Arrays;

import java.util.Arrays;

public class Sort1 
{
	public static void print(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {0,1,1,1,0,1,0,1,0,1,1,0,0};
		//System.out.print(arr);//Prints the address
		print(arr);
		
		
		System.out.println();
		
		Arrays.sort(arr);
		print(arr);
		
				
	}
		// TODO Auto-generated method stub

	

}
