package leet.MultiDimensionalArray;

public class Rotation 
{
	public static void print(int[][] arr)
	{
		int m=arr.length;
		int n=arr[0].length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void swap(int[][] arr,int i,int j)
	{
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
	public static void rotate(int[][] arr)
	{
		int m=arr.length;
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<=i;j++)
			{
				swap(arr,i,j);
			}
		}
	
	
		for(int i=0;i<m;i++)
		{
			int a=0,b=m-1;
			while(a<b)
			{
				int temp=arr[i][a];
				arr[i][a]=arr[a][b];
				arr[a][b]=temp;
				a++;
				b--;
			}
			
		}
		print(arr);
	}
	public static void main(String[] args)
	{
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		print(arr);
		System.out.println();
		rotate(arr);
	}
	

}
