package LinkedList2;

public class Cycle1 
{
	public static boolean hasCycle(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	// 3times
	
	public static boolean hasCycle2(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next.next;
			
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	//4 times
	public static boolean hasCycle3(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null&&fast.next.next!=null&&fast.next.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next.next.next;
			
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next=c;
		
		System.out.println(hasCycle(a));
		System.out.println(hasCycle2(a));
		System.out.println(hasCycle3(a));
	}

}
