package LinkedList2;

public class Intersection 
{
	public static Node getIntersection(Node headA,Node headB)
	{
		Node tempA=headA;
		Node tempB=headB;
		
		int lenA=0;
		while(tempA!=null)
		{
			tempA=tempA.next;
			lenA++;
		}
		int lenB=0;
		while(tempB!=null)
		{
			tempB=tempB.next;
			lenB++;
		}
		
		tempA=headA;
		tempB=headB;
		
		if(lenA>lenB)
		{
			for(int i=1;i<=lenA-lenB;i++)
			{
				tempA=tempA.next;
			}
		}
		else
		{
			for(int i=1;i<=lenB-lenA;i++)
			{
				tempB=tempB.next;
			}
		}
		
		while(tempA!=tempB)
		{
			tempA=tempA.next;
			tempB=tempB.next;
			
		}
		return tempA;
	}

	public static void main(String[] args) 
	{
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

		Node x = new Node(5);
		Node y = new Node(15);

		x.next = y;
		y.next = c;      // Intersection starts here

		// List1:
		// 10 -> 20 -> 30 -> 40 -> 50 -> 60

		// List2:
		// 5 -> 15 -> 30 -> 40 -> 50 -> 60
		
		System.out.println(getIntersection(a,x));
		

	}

}
