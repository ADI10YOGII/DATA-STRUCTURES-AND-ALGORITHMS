package leet.DoublyLinkedList;


public class Flatten 
{
	public static DNode flatten(DNode head)
	{
		DNode temp=head;
		while(temp!=null)
		{
			DNode n=temp.next;
			if(temp.child!=null)
			{
				DNode c=flatten(temp.child);
				DNode d=c;
				
				while(d.next!=null)
				{
					d=d.next;
				}
				temp.next=c;
				c.prev=temp;
				d.next=n;
				if(n!=null)
				{
					n.prev=d;
				}
				
				temp.child=null;
				
			}
			else
			{
				temp=n;
			}
		}
		return head;
		
	}

	public static void main(String[] args) 
	{
		DNode a=new DNode(10);
		DNode b=new DNode(20);
		DNode c=new DNode(30);
		DNode d=new DNode(40);
		DNode e=new DNode(50);
		DNode f=new DNode(60);
		DNode g=new DNode(70);
		DNode h=new DNode(80);
		DNode i=new DNode(90);
		DNode j=new DNode(100);
		DNode k=new DNode(110);
		DNode l=new DNode(120);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		c.child=g;
		g.next=h;
		h.next=i;
		i.next=j;
		h.child=k;
		k.next=l;
		
		System.out.println(flatten(a));
		
		
		
		// TODO Auto-generated method stub

	}

}
