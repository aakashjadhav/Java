class ReverseLL
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

public void reverse()
{
Node current=head,next,prev=null;

while(current!=null)
{
next=current.next;
current.next=prev;
prev=current;
current=next;
}
head=prev;
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

public static void main(String arg[])
{
ReverseLL revll=new ReverseLL();
revll.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

revll.head.next=second;
second.next=third;

revll.printLL();
revll.reverse();
System.out.println("After reverse");
revll.printLL();
}

}
