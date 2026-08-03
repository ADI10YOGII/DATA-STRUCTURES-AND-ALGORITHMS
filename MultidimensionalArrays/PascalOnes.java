package leet.MultiDimensionalArray;

import java.util.ArrayList;
import java.util.*;

public class PascalOnes 
{
	public static List<List<Integer>> pascal(int n)
	{
		List<List<Integer>> ans=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			List<Integer> l=new ArrayList<>();
			for(int j=0;j<=i;j++)
			{
				l.add(1);
				
			}
			ans.add(l);
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int n=4;
		System.out.println(pascal(n));
		
		// TODO Auto-generated method stub

	}

}
