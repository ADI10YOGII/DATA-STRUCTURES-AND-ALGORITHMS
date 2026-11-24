package leet.Stacks;
import java.util.*;

public class MinimumBracketsRemoval 
{
    public static int minRemove(String s)
    {
        Stack<Character> st = new Stack<>();
        int remove = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
                else
                {
                    remove++;
                }
            }
        }
      //Minimum removals = Unmatched closing brackets + Unmatched opening brackets
        return remove + st.size();
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(minRemove(s));
		
		sc.close();
	}
		
		//Minimum removals = Unmatched closing brackets + Unmatched opening brackets
}
