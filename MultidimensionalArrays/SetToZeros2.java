package leet.MultiDimensionalArray;

public class SetToZeros2 
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
	public static void set(int[][] arr)
	{
		int m=arr.length;
		int n=arr[0].length;
		
		boolean[] row=new boolean[m];
		boolean[] col=new boolean[n];
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==0)
				{
					row[i]=true;
					col[j]=true;
				}
			}
		}
		
		for(int i=0;i<m;i++)
		{
			if(row[i]==true)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=0;	
				}
			}
		}
		for(int j=0;j<n;j++)
		{
			if(col[j]==true)
			{
				for(int i=0;i<m;i++)
				{
					arr[i][j]=0;
				}
			}
		}
		
		print(arr);
	}

	public static void main(String[] args) 
	{
		int[][] arr= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		set(arr);
		// TODO Auto-generated method stub

	}

}
