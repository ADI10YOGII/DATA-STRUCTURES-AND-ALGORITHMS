package leet.Strings;
import java.util.*;

public class Operations 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
//		//Takes the first word
//		String s1=sc.next();		
//		System.out.println(s1);
//		
//		System.out.println();
//		
//		
//		//Takes every word in a sentence
//		String s2=sc.nextLine();
//		System.out.println(s2);
		
		
		//Compare Operations
		
		String a="abc";
		String b="def";
		
		System.out.println(a.compareTo(b));
		
		
		
		String c="abc";
		String d="abcfff";
		System.out.println(c.compareTo(d));
		
		String e="abcfff";
		String f="abc";
		System.out.println(e.compareTo(f));
		
		System.out.println(a+b);
		System.out.println(a+"b");
		System.out.println(a+10);
		System.out.println(a+10+20);
		System.out.println(10+20+a);
		
		
		//Interning:To save space
		
		String s="Raghav";//Immutable
		
		
		s="Madhav"; //In memory both raghav and madhav will be there but now s will only point to Madhav.
		
		System.out.println(s);
		
		String q="Madhav";
		String t="Madhav";
		
		System.out.println(t+" "+q);//points to the same memory location
		
		String w=new String("Madhav");
		System.out.println(w);//points to a different memory location.
		
		
		
		String s1="abcxyz";
		String s2="abcxyz";
		
		System.out.println(s1==s2);
		
		String t1="abc";
		t1=t1+"xyz";
		
		System.out.println(s1==t1);//== compares the addresses
		
		String t2=new String(s1);
		System.out.println(s1==t2);
		
		
		System.out.println(s1.equals(t1));
		System.out.println(s1.equals(t2));//equals compare character by character.
		
		
		
		
		
		
		
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
