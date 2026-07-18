package leet.Arrays;

public class Sort3 
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
		int i=0,j=n-1;
		while(i<j)
		{
			if(arr[i]==0)
				i++;
			if(arr[j]==1)
				j--;
			if(i>j)
				break;
			if(arr[i]==1&&arr[j]==0)
			{
				arr[i]=0;
				arr[j]=1;
				i++;
				j--;
			}
				
		}
	
	}

	public static void main(String[] args) 
	{
		int[] arr= {0,0,0,1,1,1};
		//System.out.print(arr);//Prints the address
		print(arr);
		
		
		System.out.println();
		
		sort(arr);
		print(arr);
		// TODO Auto-generated method stub

	}

}
