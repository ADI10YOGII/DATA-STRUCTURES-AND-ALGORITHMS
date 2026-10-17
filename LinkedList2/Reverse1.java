package LinkedList2;

public class Reverse1 
{
	public static Node reverse(Node head)
	{
		if(head==null)
		{
			return head;
		}
		Node prev=null;
		Node curr=head;
		Node Next=head;;
		
		while(curr!=null)
		{
			Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
		}
		return prev;
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
		
		System.out.println(reverse(a));
		

	}

}
