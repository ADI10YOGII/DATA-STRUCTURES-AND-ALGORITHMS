package leet.Arrays;

public class Reverse2 
{
	public static void swap(int i,int j,int[] arr)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void print(int [] arr)
	{
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}
	public static void rev(int[] arr)
	{
		int n=arr.length;
		int i=0,j=n-1;
		
		
		while(i<=j)
		{
			swap(i,j,arr);
			i++;
			j--;
		}
		print(arr);
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7};
		rev(arr);
		// TODO Auto-generated method stub

	}

}
