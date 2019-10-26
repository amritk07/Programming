package daa;
class Node
{
	int data;
	Node next;
}
class LinkedList
{
	Node head;
	public void insertEnd(int data)
	{
		Node node = new Node();
		node.data= data;
		node.next= null;
		if(head==null)
		{
			head= node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next=node;
		}
	}
	public void insertBeg(int data)
	{
		Node n = new Node();
		n.data= data;
		n.next= null;
		if(head==null)
		{
			head = n;
		}
		else
		{
			n.next = head;
			head = n;
		}
		
	}
	public void show()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}
}

public class LinkedList1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList l1 = new LinkedList();
          l1.insertEnd(2);
          l1.insertEnd(2);
          l1.insertEnd(2);
          l1.insertEnd(2);
          l1.insertBeg(15);
          l1.insertBeg(23);
          l1.insertBeg(7);
          l1.insertBeg(54);
          l1.show();
	}

}
