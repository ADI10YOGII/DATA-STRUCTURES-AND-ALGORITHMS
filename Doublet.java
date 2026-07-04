package leet.Arrays;

public class Doublet 
{

	public static void main(String[] args) 
	{
		int x=9;
		
		int [] arr= {1,2,3,4,5,6,7};
		
		int n=arr.length;

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==x)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		

	}

}
