package leet.Arrays;

public class MergeArrays 
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
		int[] a= {11,33,42,71};
		int[] b= {26,54,69,81};
		
		print(a);
		System.out.println();
		print(b);
		System.out.println();
		
		int m=a.length;
		int n=b.length;
		
		int[] c=new int[m+n];
		int i=0,j=0,k=0;
		
		while(i<m&&j<n) 
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			k++;
					
		}
		
		if(i==a.length)
		{
			while(j<n)
			{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		if(j==b.length)
		{
			while(i<m)
			{
				c[k]=a[i];
				i++;
				k++;
			}
		}
		
		print(c);
		// TODO Auto-generated method stub

	}

}
