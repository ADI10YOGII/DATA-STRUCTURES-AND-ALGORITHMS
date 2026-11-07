package leet.DoublyLinkedList;

class DNode
{
	int val;
	DNode next;
	DNode prev;
	DNode child;
	
	DNode(int val)
	{
		this.val=val;
	}
}
class DLL
{
	DNode head;
	DNode tail;
	int size;
	
	void display()
	{
		DNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	void insert(int idx,int val)
	{
		if(idx==0)
		{
			insertAtHead(val);
			return;
		}
		if(idx==size)
		{
			insertAtTail(val);
			return;
		}
		if(idx>size||idx<0)
		{
			System.out.println("Invalid");
		}
		
		DNode temp=new DNode(val);
		DNode x=head;
		for(int i=1;i<idx-1;i++)
		{
			x=x.next;
		}
		DNode y=x.next;
		
		x.next=temp;
		temp.prev=x;
		temp.next=y;
		y.prev=temp;
		
		size++;
	}
	void insertAtHead(int val)
	{
		DNode temp=new DNode(val);
		if(size==0)
		{
			head=tail=temp;
		}
		else
		{
			temp.next=head;
			head.prev=temp;
			head=temp;
		}

		size++;
	}
	
	void insertAtTail(int val)
	{
		DNode temp=new DNode(val);
		if(size==0)
		{
			head=tail=temp;
		}
		else
		{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
		size++;
	}
	void deleteAtHead()
	{
		if(head==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			head=head.next;
			head.prev=null;
			size--;	
		}
	}
	void deleteAtTail()
	{
		if(tail==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			tail=tail.prev;
			tail.next=null;
			size--;
		}
	}
	void delete(int idx)
	{
		if(idx==0)
		{
			deleteAtHead();
			return;
		}
		if(idx==size-1)
		{
			deleteAtTail();
			return;
		}
		if(idx<0||idx>size)
		{
			System.out.println("Empty list");
		}
		DNode temp=head;
		
		for(int i=0;i<idx-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		temp=temp.next;
		temp.prev=temp.prev.prev;
		size--;
	}

}
class DoublyLinkedListImplementation
{
	public static void print(DNode head)
	{
		DNode temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val+" ");
			temp=temp.next;
		}
	}
	public static void reverse(DNode tail)
	{
		DNode temp=tail;
		while(temp!=null)
		{
			System.out.println(temp.val+" ");
			temp=temp.prev;
		}
	}
	public static void display(DNode node)
	{
		DNode temp=node;
		while(temp.prev!=null)
		{
			temp=temp.prev;
		}
		
		print(temp);
		
	}
	
	public static void main(String[] args) 
	{
//		DNode a=new DNode(10);
//		DNode b=new DNode(20);
//		DNode c=new DNode(30);
//		DNode d=new DNode(40);
//		

//		
//		a.next=b;
//		b.prev=a;
//		b.next=c;
//		c.prev=b;
//		c.next=d;
//		d.prev=c;
//		
//		print(a);
//		
//		System.out.println();
//		
//		reverse(d);
//		
//		System.out.println();
//		
//		display(c);
		
		DLL list=new DLL();
		
		list.display();
		
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.display();
		list.insertAtTail(40);
		list.display();
		System.out.println(list.size);
		System.out.println();
		list.insertAtHead(50);
		list.display();
		list.insert(2, 80);
		list.display();
		list.deleteAtHead();
		list.display();
		System.out.println(list.size);
		list.deleteAtTail();
		list.display();
		System.out.println(list.size);
		System.out.println();
		list.delete(3);
		list.display();
		System.out.println();
		
		
		
		

	}

}
