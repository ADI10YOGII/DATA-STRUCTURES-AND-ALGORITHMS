package leet.MultiDimensionalArray;

public class ColumnwisePrinting 
{
	public static void main(String[] args) 
	{
		int[][] arr= {{1,2},{3,4},{5,6}};
		int m=arr.length;
		int n=arr[0].length;
		
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<m;i++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		// TODO Auto-generated method stub

	}


}
