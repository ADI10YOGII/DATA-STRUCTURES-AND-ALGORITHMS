package leet.Strings;

public class Maximum1 {

	public static void main(String[] args) 
	{
		String[] arr= {"455","746745","56354","0025"};
		
		int mx=Integer.parseInt(arr[0]);
		
		for(int i=0;i<arr.length;i++)
		{
			int n=Integer.parseInt(arr[i]);
			mx=Math.max(mx,n);
		}
		System.out.println(mx);

	}

}
