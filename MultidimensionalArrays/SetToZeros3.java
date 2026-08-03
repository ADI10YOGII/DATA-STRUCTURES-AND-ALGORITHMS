package leet.MultiDimensionalArray;

public class SetToZeros3 
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
	public static void check(int[][] arr)
	{
		boolean zeroRow=false;
		boolean zeroCol=false;
		//checking for zeros in 0th row and 0 th column
		int m=arr.length;
		int n=arr[0].length;
		
		for(int j=0;j<n;j++)
		{
			if(arr[0][j]==0)
			{
				zeroRow=true;
				break;
			}
		}
		for(int i=0;i<m;i++)
		{
			if(arr[i][0]==0)
			{
				zeroCol=true;
			}
		}
		
		set(arr,zeroRow,zeroCol);
	}
	public static void set(int[][] arr,boolean zeroRow,boolean zeroCol)
	{
		int m=arr.length;
		int n=arr[0].length;
		
		
		//checking for zeros in subset of given array
		
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(arr[i][j]==0)
				{
					arr[i][0]=0;
					arr[0][j]=0;
				}
			}
		}
		
		//converting the rows and column to all zeros.
		
		for(int i=0;i<m;i++)
		{
			if(arr[i][0]==0)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=0;
				}
			}
		}
		
		for(int j=0;j<n;j++)
		{
			if(arr[0][j]==0)
			{
				for(int i=0;i<m;i++)
				{
					arr[i][j]=0;
				}
			}
		}
		
	
		
		
		if(zeroRow==true)
		{
			for(int j=0;j<n;j++)
			{
				arr[0][j]=0;
			}
			
		}
		if(zeroCol==true)
		{
			
			for(int i=0;i<m;i++)
			{
				arr[i][0]=0;
			}
			
		}
		
		print(arr);
		
	}

	public static void main(String[] args) 
	{
		int[][] arr= {{1,2,2,11,21},{3,0,24,21,9},{6,10,7,0,-8},{8,4,19,3,99}};
		check(arr);

	}

}
