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

public void insertAtStart(int new_data)
{

Node new_node=new Node(new_data);
new_node.next=head;
head=new_node;
}

public void insertAfter(Node previous_node,int new_data)
{

if(previous_node==null)
{
System.out.println("Previous node cannot be null");
return;
}

Node new_node=new Node(new_data);
new_node.next=previous_node.next;
previous_node.next=new_node;

}

public void insertAtEnd(int new_data)
{
Node new_node=new Node(new_data);
if(head==null)
{
head=new_node;
return;
}

new_node.next=null;

Node last;
last=head;
while(last.next!=null)
last=last.next;

last.next=new_node;
}

public void printList()
{
Node n=head;

while(n!=null)
{
System.out.println("Node is "+n.data);
n=n.next;
}

}

public static void main(String arg[])
{
LinkL llink=new LinkL();

llink.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

llink.head.next=second;
second.next=third;

llink.printList();
//llink.insertAtStart(4);
//llink.insertAfter(second,7);
llink.insertAtEnd(8);

System.out.println("\n");
llink.printList();
}
}
