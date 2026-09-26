package LinkedList2;

public class Delete 
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
	public static void delete(Node node)
	{
		node.val=node.next.val;
		node.next=node.next.next;
	}

	public static void main(String[] args) 
	{
		Node a=new Node(10);
		Node b=new Node(20);
		Node c=new Node(30);
		Node d=new Node(40);
		
		a.next=b;
		b.next=c;
		c.next=d;
		
		print(a);
		System.out.println();
		
		delete(c);
		print(a);
		

	}

}
