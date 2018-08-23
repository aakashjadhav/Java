class IterativeSearch
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

public boolean search(Node n,int key)
{
Node temp=n;
while(temp!=null)
{
if(temp.data==key)
return true;

temp=temp.next;
}
return false;
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
IterativeSearch itsearch=new IterativeSearch();
itsearch.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

itsearch.head.next=second;
second.next=third;

itsearch.printLL();
if(itsearch.search(itsearch.head,1))
System.out.println("Element present");
else
System.out.println("Element absent");
}

}
