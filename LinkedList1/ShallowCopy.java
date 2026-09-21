package leet.LinkedList1;



public class ShallowCopy 
{

	public static void main(String[] args) 
	{
		Node a=new Node(100);
		System.out.println(a.val);
		
		Node temp=a;//Shallow copy
		System.out.println(temp.val);
		
		
		System.out.println(a);
		System.out.println(temp);//Both have same address
		
		temp.val=12;
		System.out.println(a.val);
		System.out.println(temp.val);
		
		
		Node b=new Node(200);
		Node temp1=new Node(200);//Deep copy
		
		
		System.out.println(b.val);
		System.out.println(temp1.val);
		
		System.out.println(b);
		System.out.println(temp1);
		
		temp1.val=1200;
		System.out.println(b.val);
		System.out.println(temp1.val);
		
		System.out.println(b);
		System.out.println(temp1);
		
		
	}

}
