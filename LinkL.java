class LinkL
{
Node head;

	static class Node//made static so that it can be accessed by main()
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}	
	}
public static void main(String arg[])
{
	LinkL llist=new LinkL();
	
	llist.head=new Node(1);
	Node second=new Node(2);
	Node third=new Node(3);

	llist.head.next=second;
	second.next=third;
}
}
