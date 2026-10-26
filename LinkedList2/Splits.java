package LinkedList2;

public class Splits 
{
	public static int lengthoflist(Node head)
	{
		int len=0;
		Node temp=head;
		while(temp!=null)
		{
			len++;
			temp=temp.next;
		}
		return len;
	}
	public static Node[] split(Node head,int k)
	{
		int n=lengthoflist(head);
		
		int size=n/k;
		
		int extra=n%k;
		
		Node[] arr=new Node[k];
		
		int idx=0;
		
		Node temp=head;
		
		int len=1;
		
		while(temp!=null)
		{
			int s=size;
			if(extra>0)
			{
				size++;
			}
			if(len==1)
			{
				arr[idx++]=temp;
			}
			if(len==s)
			{
				Node a=temp.next;
				temp.next=null;
				temp=a;
				len=1;
				extra--;	
			}
			else
			{
				len++;
				temp=temp.next;
			}
		}
		return arr;			
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
		int k=3;
		
		System.out.println(split(a,k));
		// TODO Auto-generated method stub

	}

}
