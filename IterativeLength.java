class IterativeLength
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

public int length()
{
Node n=head;
int count=0;

while(n!=null)
{
count++;
n=n.next;
}
return count;
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
IterativeLength itl=new IterativeLength();
itl.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

itl.head.next=second;
second.next=third;

itl.printLL();
int len=itl.length();
System.out.println("Length is "+len);
}

}
