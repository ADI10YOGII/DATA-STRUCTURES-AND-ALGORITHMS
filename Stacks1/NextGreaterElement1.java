package leet.Stacks;

public class NextGreaterElement1 
{

	public static void main(String[] args) 
	{
		int[] arr= {1,3,2,1,8,6,3,4};
		int n=arr.length;
		int[] res=new int[n];
		
		for(int i=0;i<n;i++)
		{
			res[i]=-1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					res[i]=arr[j];
					break;
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
		

	}

}
