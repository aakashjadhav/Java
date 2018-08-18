class LinkL
{
	Node head;
	static class Node//so that this class can be accessed by main()
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
}
