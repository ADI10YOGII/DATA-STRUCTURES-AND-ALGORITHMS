package leet.Reccursion;
import java.util.*;
public class MazePath 
{
	public static int maze1(int r,int c,int m,int n)
	{
		if(r==m||c==n)
			return 1;
		
		int rightWays=maze1(r,c+1,m,n);
		int leftWays=maze1(r+1,c,m,n);
		
		int totalWays=rightWays+leftWays;
		
		return totalWays;
	}
	public static int maze2(int m,int n)
	{
		if(m==1||n==1)
			return 1;
		
		int rightWays=maze2(m,n-1);
		int leftWays=maze2(m-1,n);
		
		int totalWays=rightWays+leftWays;
		return totalWays;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println(maze1(1,1,m,n));
		System.out.println(maze2(m,n));
		sc.close();
		// TODO Auto-generated method stub

	}

}
