package leet.Arrays;

import java.util.Scanner;

public class RotateK 
{
	
	public static void rev(int i,int j,int[] arr)//Reversing the array
	{

		
		while(i<=j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
		

	}
	public static void print(int [] arr)//Printing the array
	{
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}
	public static void rotate(int[] arr,int k,int n)//Roatating by K-steps
	{
		k=k%n;
		rev(0,n-k-1,arr);
		rev(n-k,n-1,arr);
		rev(0,n-1,arr);
		print(arr);
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");

		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)//Taking input from user.
		{
			arr[i]=sc.nextInt();
			
		}
		print(arr);
		
		System.out.println();
		
		System.out.println("Enter the value for k");
		int k=sc.nextInt();
		
		rotate(arr,k,n);
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
