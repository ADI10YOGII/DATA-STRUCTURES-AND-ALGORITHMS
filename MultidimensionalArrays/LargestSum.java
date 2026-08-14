package leet.MultiDimensionalArray;
import java.util.*;
public class LargestSum 
{
	public static int sum(int[][] arr)
	{
		int m=arr.length;
		int n=arr[0].length;
		
		int mr=Integer.MIN_VALUE;
		for(int i=0;i<m;i++)
		{
			int s=0;
			for(int j=0;j<n;j++)
			{
				s+=arr[i][j];
				
			}
			mr=Math.max(mr, s);	
		}
		
		
		int mc=Integer.MIN_VALUE;
		for(int j=0;j<n;j++)
		{
			int sum=0;
			for(int i=0;i<m;i++)
			{
				sum+=arr[i][j];
				
			}
			mc=Math.max(mc, sum);	
		}
		
		return mr+mc;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int[][] arr=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(sum(arr));
		
		sc.close();

	}

}
