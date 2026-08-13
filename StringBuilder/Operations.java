package leet.StringBuilder;

public class Operations 
{

	public static void main(String[] args) 
	{
		//String s="Raghav";
		
		StringBuilder sb=new StringBuilder("abc");
		System.out.println(sb.capacity());
		
		
		StringBuilder x=new StringBuilder("");
		System.out.println(x.capacity());
		
		StringBuilder y=new StringBuilder(10);
		System.out.println(y.capacity());
		
		
		StringBuilder sb1=new StringBuilder("raghav");
		StringBuilder sb2=new StringBuilder("madhav");
		
		System.out.println(sb1.compareTo(sb2));
		
		
		System.out.println(sb1.reverse());
		
		
		String s1="abcdef";
		StringBuilder sb3=new StringBuilder(s1);
		
		System.out.println(sb3);
		
		sb3.setCharAt(1,'a');
		
		System.out.println(sb3);
		
		StringBuilder sb4=new StringBuilder("Abc");
		System.out.println(sb4);
		
		sb4.append(35);
		System.out.println(sb4);
		
		sb4.append('*');
		System.out.println(sb4);
		
		char[] ch= {'r','a','g'};
		sb4.append(ch);
		System.out.println(sb4);
		
		int[] arr= {1,2,3,4,5};
		sb4.append(arr);//appends the address
		System.out.println(sb4);
		
		StringBuilder t=new StringBuilder("pqr");
		sb4.append(t);
		System.out.println(sb4);
		
		

	}

}
