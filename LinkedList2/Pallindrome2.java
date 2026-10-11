package LinkedList2;

public class Pallindrome2 
{
	public static Node reverse(Node head)
	{
		Node curr=head;
		Node Next=head;
		Node prev=null;
		
		while(curr!=null)
		{
			Next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=Next;
		}
		return prev;
	}
	public static boolean check(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		Node j=reverse(slow);
		Node i=head;
		
		while(j!=null)
		{
			if(i.val!=j.val)
			{
				return false;
			}
			i=i.next;
			j=j.next;
			
		}
		return true;

	}

	public static void main(String[] args) 
	{
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(20);
		Node e=new Node(10);
		
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
	
		
		System.out.println(check(a));
		
	}

}
