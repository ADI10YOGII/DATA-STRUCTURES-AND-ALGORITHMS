package leet.LinkedList1;
class SLL
{
	Node head;
	Node tail;
	int size;
	
	void insertAtTail(int val)
	{
		Node temp=new Node(val);
		
		if(head==null)
		{
			head=tail=temp;
		}
		else
		{
			tail.next=temp;
			tail=temp;	
		}
		size++;
	}
	void insertAtHead(int val)
	{
		Node temp=new Node(val);
		if(head==null)
		{
			head=tail=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
		size++;
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
			System.out.println("Invalid index");
			return;
		}
		Node temp=new Node(val);
		Node x=head;
		
		for(int i=0;i<=idx-1;i++)
		{
			x=x.next;
		}
		temp.next=x.next;
		x.next=temp;
		size++;
	}
	
	int get(int idx)
	{
		if(idx==size-1)
		{
			return tail.val;
		}
		if(idx>size||idx<0)
		{
			System.out.println("Invalid index");
			return-1;	
		}
		Node temp=head;
		for(int i=0;i<=idx;i++)
		{
			temp=temp.next;
		}
		return temp.val;
	}
	
//	int get(int idx)throws Error
//	{
//		if(idx==size)
//		{
//			return tail.val;
//		}
//		if(idx>size||idx<0)
//		{
//			throw new Error("Invalid index");
//			
//		}
//		Node temp=head;
//		for(int i=0;i<=idx;i++)
//		{
//			temp=temp.next;
//		}
//		return temp.val;
//	}
	void set(int idx,int val)
	{
		if(idx==size)
		{
			tail.val=val;
		}
		if(idx>size||idx<0)
		{
			System.out.println("Invalid index");
				
		}
		Node temp=head;
		for(int i=0;i<=idx;i++)
		{
			temp=temp.next;
		}
	   temp.val=val;
		
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;	
		}
		System.out.println();
	}
	void deleteAtHead()throws Error
	{
		if(head==null)
		{
			throw new Error("List is empty");
		
		}
		head=head.next;
		size--;
	}	
	
	void delete(int idx)throws Error
	{
		if(idx==0)
		{
			deleteAtHead();
			return;
		}
		if(head==null)
		{
			throw new Error("Empty");
		}
		if(idx<0||idx>=size)
		{
			throw new Error("Empty");
		}
		Node temp=head;
		for(int i=1;i<=idx-1;i++)
		{
			temp=temp.next;
		}
		if(temp.next==tail)
		{
			tail=temp;
		}
		temp.next=temp.next.next;
		size--;
		
	}
    int size()

	{
		return size;
	}
	
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.val+" ");
			if(temp.next==head)
			{
				break;
			}
			else
			{
				temp=temp.next;
			}
		}
	}
	
//	void deleteAtHead()
//	{
//		if(head==null)
//		{
//			System.out.println("Empty");
//		}
//		head=head.next;
//		size--;
//	}
}
public class ImplementationLL 
{

	public static void main(String[] args) 
	{
		SLL list=new SLL();
		System.out.println(list.size());
		
		list.insertAtTail(10);
		list.insertAtTail(20);
		list.insertAtTail(30);
		list.insertAtTail(40);
		System.out.println(list.size());
		list.display();
		
		System.out.println();
		list.insertAtTail(24);
		System.out.println(list.size());
		list.display();
		
		list.insertAtHead(1);
		list.display();
		
		System.out.println();
		list.insert(2, 25);
		list.display();
		System.out.println(list.get(3));
		
		list.display();
//		System.out.println(list.get(-1));
		
		System.out.println();
		
		list.set(2,35);
		list.display();
		
		list.deleteAtHead();
		list.display();
		
		System.out.println();
		list.delete(4);
		list.display();
	
		

	}

}
