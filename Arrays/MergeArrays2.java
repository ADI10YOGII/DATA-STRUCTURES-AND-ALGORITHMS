package leet.Arrays;



public class MergeArrays2
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
		int i=m-1,j=n-1,k=m+n-1;
		
		while(i>=0&&j>=0) 
		{
			if(a[i]<b[j])
			{
				c[k]=b[j];
				j--;
			}
			else
			{
				c[k]=a[i];
				i--;
			}
			k--;
					
		}
		
		while(i >= 0)
		{
		    c[k] = a[i];
		    i--;
		    k--;
		}

		while(j >= 0)
		{
		    c[k] = b[j];
		    j--;
		    k--;
		}
		
		print(c);
		// TODO Auto-generated method stub

	}

}
