package LinkedList2;

public class reverseSubPart 
{
	public static Node reverse(Node head)
	{
		Node Next=head;
		Node curr=head;
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
	public static Node reverseSub(Node head,int left,int right)
	{
		Node temp=head;
		Node a=null,b=null,c=null,d=null;
		int pos=1;
		while(temp!=null)
		{
			if(pos==left-1)
				a=temp;
			if(pos==left)
				b=temp;
			if(pos==right)
				c=temp;
			if(pos==right+1)
				d=temp;
			
			temp=temp.next;
			pos++;
		}
		
		if(a!=null)
			a.next=null;
		if(c!=null)
			c.next=null;
		
		reverse(b);
		
		if(a!=null)
			a.next=c;
		b.next=d;
		
		if(a==null)
			return c;
		
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
		
		System.out.println(reverseSub(a,3,5));
		// TODO Auto-generated method stub

	}

}
