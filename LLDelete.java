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

public void deleteKey(int key)
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

public void printLL()
{
Node n=head;
if(n==null)
{
System.out.println("Link list is empty");}

while(n!=null)
{
System.out.println("Data is"+n.data);
n=n.next;
}

}

public void deletePos(int pos)
{

if(head==null)
return;

Node n=head; 

if(pos==0)
{
head=n.next;
return;
}

for(int i=0;n!=null && i<pos-1;i++)
n=n.next;

if(n==null || n.next==null)return;

Node new_node=n.next.next;

n.next=new_node;

}


public static void main(String arg[])
{
LLDelete ll=new LLDelete();
ll.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

ll.head.next=second;
second.next=third;

ll.printLL();
ll.deleteKey(2);
ll.printLL();
ll.deletePos(0);
ll.printLL();
}

}
