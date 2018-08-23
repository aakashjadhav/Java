class RecLength
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

public int recLength(Node n)
{
if(n==null)return 0;

return 1+recLength(n.next);
}

public int length()
{
return recLength(head);
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
RecLength recl=new RecLength();
recl.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

recl.head.next=second;
second.next=third;

recl.printLL();
int len=recl.length();
System.out.println("Length is "+len);
}

}
