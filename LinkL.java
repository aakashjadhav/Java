class LinkL
{
Node head;

	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
	}

public void insertAtBeginning(int new_data)//insert data at beginning
{
Node new_node=new Node(new_data);

new_node.next=head;
head=new_node;
}


public void printList()
{
Node n=head;

while(n!=null)
{
	System.out.println("Data is "+n.data);
	n=n.next;
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

System.out.println("Link list before Inserting at Beginning");
llist.printList();

System.out.println("Link list after Inserting at Beginning");
llist.insertAtBeginning(4);
llist.printList();

}

}
