package LinkedList2;

public class MergeSorted 
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
	public static Node mergelists(Node a,Node b)
	{

		Node dummy=new Node(100);
		Node temp=dummy;
		Node temp1=a;
		Node temp2=b;
		while(temp1!=null&&temp2!=null)
		{
			if(temp1.val<temp2.val)
			{
				temp.next=temp1;
				temp1=temp1.next;
			}
			else
			{
				temp.next=temp2;
				temp2=temp2.next;
			}
			temp=temp.next;
			
			if(temp1==null)
			{
				temp.next=temp2;
			}
			else
			{
				temp.next=temp1;
			}
		}
		return dummy.next;
	}

	public static void main(String[] args) 
	{
		Node a = new Node(10);
		Node b = new Node(30);
		Node c = new Node(40);
		Node d = new Node(60);
		
		Node e = new Node(20);
		Node f = new Node(50);
		Node g = new Node(70);
		Node h = new Node(75);
		Node i = new Node(80);
		
		


		a.next = b;
		b.next = c;
		c.next = d;
	
		e.next = f;
		f.next = g;
		g.next = h;
		h.next = i;
		
		print(a);
		
		System.out.println();
		
		print(e);
		
		System.out.println();
		
		System.out.println(mergelists(a,e));
		
		
		
		

	}

}
