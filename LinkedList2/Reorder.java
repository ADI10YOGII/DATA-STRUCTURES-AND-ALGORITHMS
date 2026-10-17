package LinkedList2;

public class Reorder 
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
	public static Node middle(Node head)
	{
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static void reorder(Node head)
	{
		Node leftmiddle=middle(head);
		Node head2=leftmiddle.next;
		
		leftmiddle.next=null;
		
		head2=reverse(head2);
		
		Node dummy=new Node(-1);
		Node temp=dummy;
		
		while(head!=null&&head2!=null)
		{
			temp.next=head;
			head=head.next;
			temp=temp.next;
			
			temp.next=head2;
			head2=head2.next;
			temp=temp.next;
		}
        if(head==null)
        {
            temp.next=head2;
        }
        if(head2==null)
        {
            temp.next=head;
        }
		head=dummy.next;
		System.out.println(head);
		
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
		
		reorder(a);
		

	}

}
