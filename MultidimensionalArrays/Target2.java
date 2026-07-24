package leet.MultiDimensionalArray;

import java.util.Scanner;

public class Target2 
{
	public static boolean find(int[][] arr,int target)
	{
		int m=arr.length;
		int n=arr[0].length;
		
		int i=0;
		int j=n-1;
		
		while(i<m&&j>=0)
		{
			if(arr[i][j]==target)
				return true;
			else if(arr[i][j]>target)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		

		return false;
	}

	public static void main(String[] args) 
	{
		int[][] arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24}};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		
		System.out.println(find(arr,target));
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
