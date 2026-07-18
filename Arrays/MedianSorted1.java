package leet.Arrays;

public class MedianSorted1 
{
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int i=0,j=0,k=0;
        int n=nums1.length;
        int m=nums2.length;
        int[] c=new int[m+n];

        while(i<n&&j<m)
        {
            if(nums1[i]<nums2[j])
            {
                c[k]=nums1[i];
                i++;
            }
            else
            {
                c[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i==n)
        {
            while(j<m)
            {
                c[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(j==m)
        {
            while(i<n)
            {
                c[k]=nums1[i];
                i++;
                k++;
            }
        }


        int l=c.length;
        int mid=l/2;
        if(l%2==0)
        {

                return (c[mid]+c[mid-1])/2.0;
        }
        
            return c[mid];

        
    }


	public static void main(String[] args) 
	{
		int[] a = {1,2};
		int[] b = {3,4};
		
		System.out.println(findMedianSortedArrays(a, b));
		
//		Merging: O(m + n)
//		Finding median: O(1)
//		Overall: O(m + n)
		
		
		

	}

}
