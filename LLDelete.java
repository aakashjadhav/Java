class LLDelete
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

public void deleteNode(int key)
{

Node n=head,prev=null;

if(n!=null && n.data==key)
{
head=n.next;
return;
}

while(n!=null && n.data!=key)
{
prev=n;
n=n.next;
}

if(n==null)return;

prev.next=n.next;

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
LLDelete lld=new LLDelete();

lld.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

lld.head.next=second;
second.next=third;

lld.printList();
System.out.println("After deleting a node by Its key value");
lld.deleteNode(2);
lld.printList();
}

}

