package leet.Arrays;

public class NextGreatest2 
{
	public static void print(int[] arr)
	{
		
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr= {12,8,41,37,2,49,16,28,21};
		int n=arr.length;
		print(arr);
		System.out.println();
		int[] ans=new int[n];
		ans[n-1]=-1;
		int nge=arr[n-1];
		
		for(int i=n-1;i>=0;i--)
		{
			ans[i]=nge;
			nge=Math.max(nge, arr[i]);
		}
		
		print(ans);
		// TODO Auto-generated method stub

	}

}
