package LinkedList2;

public class Middle1 
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
	public static Node middle(Node head)
	{
		Node temp=head;
		int len=0;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		int mid=len/2+1;
		temp=head;
		for(int i=1;i<=mid-1;i++)
		{
			temp=temp.next;
		}
		return temp;
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
		
		middle(a);
		
		System.out.println();
		
		print(a);
		
		
		// TODO Auto-generated method stub

	}

}
