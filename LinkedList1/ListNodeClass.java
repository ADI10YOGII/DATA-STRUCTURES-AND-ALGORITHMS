package leet.LinkedList1;



class Node 
{
	int val;
	Node next;
	Node head;
	
	Node(int val)
	{
		this.val=val;
	}
}
public class ListNodeClass
{
	public static void print(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	public static void displayRecursive(Node head)
	{
		if(head==null)
		{
			return;
		}
		
		System.out.println(head.val);
		displayRecursive(head.next);
	}
	public static void displayCircular(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val+" ");
			if(temp.next==head)
			{
				break;
			}
			else
			{
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) 
	{
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		Node e=new Node(50);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(a.val);
		System.out.println(a.next);
		System.out.println(b.val);
		System.out.println(b.next);
		
		a.next=b;
		System.out.println(b);
		System.out.println(a.next);
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=a;
		
//		print(a);
//		print(c);
//		
//		System.out.println();
//		
//		displayRecursive(a);
//		displayRecursive(c);
		
		
//		System.out.println(a.val);
//		System.out.println(b.val);
//		System.out.println(a.next.val);
//		System.out.println(c.val);
//		System.out.println(a.next.next.val);
//		System.out.println(a.next.next.next.val);
//		
		//Or
		
//		Node temp=a;
//		while(temp!=null)
//		{
//			System.out.println(temp.val);
//			temp=temp.next;
//		}
		
		System.out.println();
		displayCircular(a);
		
		
		
		
		
		
		

	}

}
