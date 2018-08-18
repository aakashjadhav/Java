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

public void insertAfter(Node previous_node,int new_data)
{

if(previous_node==null)
{
System.out.println("Previous Node cannot be Null");
return;
}

Node new_node=new Node(new_data);
new_node.next=previous_node.next;
previous_node.next=new_node;

}

public void insertAtEnd(int new_data)
{
Node new_node=new Node(new_data);
Node n=head,temp=null;

if(head==null)
{
head=new Node(new_data);
return;
}
new_node.next=null;

while(n.next!=null)
n=n.next;
n.next=new_node;


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

//System.out.println("Link list before Inserting at Beginning");
//llist.printList();

//System.out.println("Link list after Inserting at Beginning");
//llist.insertAtBeginning(4);
//llist.printList();

//System.out.println("Link list after inserting node after a specific node");
//llist.printList();

//System.out.println("Link list before inserting node after a specific node");
//llist.insertAfter(second,4);
//llist.printList();


System.out.println("Link list before inserting node at End");
llist.printList();

System.out.println("Link list after inserting node at End");
llist.insertAtEnd(7);
llist.printList();



}

}
