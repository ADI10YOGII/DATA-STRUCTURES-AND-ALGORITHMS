package LinkedList2;

public class DeleteMiddle 
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
	public static void deletemiddle(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		fast=fast.next.next;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		slow.next=slow.next.next;
		print(head);
		
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
		
		print(a);
		
		System.out.println();
		
		deletemiddle(a);	

	}

}
