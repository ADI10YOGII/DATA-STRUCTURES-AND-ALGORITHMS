package LinkedList2;

public class MinimumMaximumDistance 
{
	public static int[] criticalPoints(Node head)
	{
		Node left=head;
		Node middle=head.next;
		Node right=head.next.next;
		
		int first=-1,last=-1;
		int idx=1;
		
		int[] arr= {-1,-1};
		int minDistance=Integer.MAX_VALUE;
		while(right!=null)
		{
			if(middle.val<left.val && middle.val<right.val||middle.val>left.val&&middle.val>right.val)
			{
				if(first==-1)
				{
				  first=idx;
				}
				if(last!=-1)
				{
					int dist=idx-last;
					minDistance=Math.min(minDistance, dist);
				}
				last=idx;	
			}
			idx++;
			left=left.next;
			middle=middle.next;
			right=right.next;
		}
		if(first==last)
			return arr;
		
		int maxDistance=last-first;
		arr[0]=minDistance;
		arr[1]=maxDistance;
		
		return arr;
	}

	public static void main(String[] args) 
	{
		Node a=new Node(5);
		Node b=new Node(3);
		Node c=new Node(1);
		Node d=new Node(2);
		Node e=new Node(5);
		Node f=new Node(1);
		Node g=new Node(2);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		
		
		System.out.println(criticalPoints(a));

	}

}
