package LinkedList2;

public class Reverse2 
{
	public static Node reverse2(Node head)
	{
		if(head==null||head.next==null)
		{
			return head;	
		}
		Node a=head.next;
		Node newHead=reverse2(a);
		
		a.next=head;
		head.next=null;
		return newHead;
	}
	public static void main(String[] args)
	{
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		Node e=new Node(50);
		Node f=new Node(60);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		
		System.out.println(reverse2(a));
	}

}
