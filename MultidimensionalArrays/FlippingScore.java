package leet.MultiDimensionalArray;

public class FlippingScore 
{
	public static void flip(int[][] arr)
	{
		int m=arr.length;
		int n=arr[0].length;
		
		for(int i=0;i<m;i++)
		{
			if(arr[i][0]==0) //flip that row
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i][j]==0)
					{
						arr[i][j]=1;
					}
					else
					{
						arr[i][j]=0;
					}
				}
			}
		}
		

		for(int j=1;j<n;j++)
		{
			int noOfZeros=0;
			int noOfOnes=0;
			
			for(int i=0;i<m;i++)
			{
				if(arr[i][j]==0)
					noOfZeros++;
				else
					noOfOnes++;
			}
			
			if(noOfZeros>noOfOnes)
			{
				for(int i=0;i<m;i++)
				{
					if(arr[i][j]==0)
					{
						arr[i][j]=1;
					}
					else
					{
						arr[i][j]=0;
					}
				}
			}
		}
	}
		
	public static int  score(int[][] arr)
	{
		int m=arr.length;
		int n=arr[0].length;
		int s=0;
		int x=1;
		for(int j=n-1;j>=0;j--)
		{
			for(int i=0;i<m;i++)
			{
				s+=(arr[i][j]*x);	
			}
			x*=2;
		}
		return s;
		
		
	}
	public static void main(String[] args)
	{
		int[][] arr= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		
		flip(arr);
		
		System.out.println(score(arr));
	}

}
