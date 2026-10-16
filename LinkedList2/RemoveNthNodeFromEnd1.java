package LinkedList2;

public class RemoveNthNodeFromEnd1 
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
	public static Node remove(Node head,int n)
	{
		Node temp=head;
		int len=0;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		
		if(len==n)
		{
			return head.next;
		}
		//n from end means (l-n+1) from start
		//we need temp=l-n
		//and to reach temp we need l-n-1
		temp=head;
		
		for(int i=1;i<=len-n-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
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
		
		remove(a,3);	

		
		
	}

}
