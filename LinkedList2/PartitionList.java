package LinkedList2;

public class PartitionList 
{
	public static Node partition(Node head,int x)
	{
		Node dummy1=new Node(-1);
		Node dummy2=new Node(-1);
		Node temp=head;
		Node temp1=dummy1;
		Node temp2=dummy2;
		
		while(temp!=null)
		{
			if(temp.val<x)
			{
				temp1.next=temp;
				temp1=temp1.next;	
			}
			else
			{
				temp2.next=temp;
				temp2=temp2.next;
			}
			temp=temp.next;
		}
		temp2.next=null;
		
		dummy1=dummy1.next;
		dummy2=dummy2.next;
		
		if(dummy1==null)
		{
			return dummy2;
		}
		
		temp1.next=dummy2;
		return dummy1;
		
	}

	public static void main(String[] args) 
	{
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(2);
		Node e = new Node(2);
		Node f = new Node(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		System.out.println(partition(a,3));
	}

}
