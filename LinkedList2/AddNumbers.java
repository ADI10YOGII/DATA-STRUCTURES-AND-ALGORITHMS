package LinkedList2;

public class AddNumbers 
{
	public static Node addnum(Node l1,Node l2)
	{
		Node dummy=new Node(-1);
		Node temp=dummy;
		int carry=0;
		
		while(l1!=null||l2!=null)
		{
			int val1=0,val2=0;
			if(l1!=null)
			{
				val1=l1.val;
			}
			if(l2!=null)
			{
				val2=l2.val;
			}
			int num=val1+val2+carry;
			
			Node node=new Node(num%10);
			temp.next=node;
			temp=temp.next;
			
			if(num>9)
				carry=1;
			else
				carry=0;
			
			l1=l1.next;
			l2=l2.next;
			
		}
		if(carry==1)
		{
			Node node=new Node(1);
			temp.next=node;
			temp=temp.next;
		}
		return dummy.next;
	
	}
	public static void main(String[] args) 
	{
		Node a=new Node(3);
		Node b=new Node(1);
		Node c=new Node(2);
		Node d=new Node(2);
		Node e=new Node(8);
		Node f=new Node(1);
		
		a.next=b;
		b.next=c;
		
		d.next=e;
		e.next=f;
		
		System.out.println(addnum(a,d));
			

	}

}
