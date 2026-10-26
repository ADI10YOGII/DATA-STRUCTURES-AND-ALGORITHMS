package LinkedList2;

public class Rotate 
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
	public static void rotate(Node head,int k)
	{
		if(head==null||head.next==null)
		{
			System.out.println(head);
		}
		Node temp=head;
		int len=0;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		k=k%len;
		if(k==0)
		{
			System.out.println( head);
		}
		
		Node slow=head;
		Node fast=head;
		
		for(int i=1;i<=k;i++)
		{
			fast=fast.next;
		}
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
		Node newHead=slow.next;
		slow.next=null;
		fast.next=head;
		
		 print(newHead);
	}

	public static void main(String[] args) 
	{
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);
		Node g = new Node(70);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		
		print(a);
		
		System.out.println();
		
		rotate(a,2);
		

	}

}
