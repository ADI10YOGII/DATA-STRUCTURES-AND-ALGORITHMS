package leet.Stacks;
import java.util.*;

public class NumberOfVisiblePeople 
{
    public static int[] canSeePersonsCount(int[] heights) 
    {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];

        for(int i=0;i<n;i++)
        {
            while(st.size()>0 && heights[st.peek()]<=heights[i])
            {
                ans[st.peek()]++;
                st.pop();
            }
            if(st.size()!=0)
            {
                ans[st.peek()]++;
            }
            st.push(i);
        }
        return ans;   
    }

	public static void main(String[] args) 
	{
		
		int[] arr= {10,6,8,5,11,9};
		System.out.println(Arrays.toString(canSeePersonsCount(arr)));
		

	}

}
