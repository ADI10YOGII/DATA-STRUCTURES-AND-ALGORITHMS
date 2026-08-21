package leet.MergeSort;

public class InversionCount1 
{

	public static void main(String[] args) 
	{
		int[] arr= {8,2,5,3,1,4};
		int n=arr.length;
		  int count=0;
		  for(int i=0;i<n-1;i++)
		  {
			  for(int j=i+1;j<n;j++)
			  {
				  if(arr[i]>arr[j])
					  count++;
			  }
			  
			  
		  }
		  System.out.println(count);
		// TODO Auto-generated method stub

	}

}
