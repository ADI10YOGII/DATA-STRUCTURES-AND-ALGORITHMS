package LinkedList2;

public class Pallindrome1 
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
	public static boolean check(Node head)
	{
		if(head.next==null)
		{
			return true;
		}
		//Creating a deep copy
		Node newHead=new Node(head.val);
		Node t1=head.next;
		Node t2=newHead;
		
		while(t1!=null)
		{
			Node temp=new Node(t1.val);
			t2.next=temp;
			t1=t1.next;
			t2=t2.next;	
		}
		newHead=reverse(newHead);
		t1=head;
		t2=newHead;
		
		while(t1!=null)
		{
			if(t1.val!=t2.val)
			  return false;
			
			t1=t1.next;
			t2=t2.next;
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
