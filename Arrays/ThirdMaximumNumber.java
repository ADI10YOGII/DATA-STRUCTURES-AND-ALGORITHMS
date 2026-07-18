package leet.Arrays;

public class ThirdMaximumNumber 
{


	    public static int thirdMax(int[] arr) 
	    {
	        int n = arr.length;

	        long mx1 = Long.MIN_VALUE;
	        
	        

	        // Find max
	        for (int i = 0; i < n; i++) {
	            mx1 = Math.max(mx1, arr[i]);
	        }
	        
	        long mx2 = Long.MIN_VALUE;

	        // Find second distinct max
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != mx1) {
	                mx2 = Math.max(mx2, arr[i]);
	            }
	        }

	        // If second max doesn't exist
	        if (mx2 == Long.MIN_VALUE) 
	        {
	            return (int) mx1;
	        }
	        long mx3 = Long.MIN_VALUE;

	        // Find third distinct max
	        for (int i = 0; i < n; i++) {
	            if (arr[i] < mx2 && arr[i] < mx1) {
	                mx3 = Math.max(mx3, arr[i]);
	            }
	        }

	        // If third max exists return it, else return max
	        return mx3 == Long.MIN_VALUE ? (int) mx1 : (int) mx3;
	    }
	    
	    public static void main(String[] args)
	    {
	    	int[] arr= {2,2,3,1};
	    	int n=thirdMax(arr);
	    	System.out.println(n);
	    }
	}



