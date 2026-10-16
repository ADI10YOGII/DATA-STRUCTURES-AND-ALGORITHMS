package LinkedList2;

public class RemoveNthNodeFromEnd2 
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
	public static Node remove2(Node head,int n)
	{
		Node slow=head;
		Node fast=head;
		
		//Move fast n steps ahead
		for(int i=1;i<=n;i++)
		{
			fast=fast.next;
		}
		if(fast==null)//n==l
		{
			return head.next;
		}
		
		//Move slow and fast together
		while(fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
        slow.next=slow.next.next;
		 return head;
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
		
		System.out.println(remove2(a,3));	
	}


}
