class RecursiveSearch
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

if(temp==null)
return false;

if(temp.data==key)
return true;

return search(temp.next,key);
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
RecursiveSearch recsearch=new RecursiveSearch();
recsearch.head=new Node(1);
Node second=new Node(2);
Node third=new Node(3);

recsearch.head.next=second;
second.next=third;

recsearch.printLL();
if(recsearch.search(recsearch.head,2))
System.out.println("Element present");
else
System.out.println("Element absent");
}

}
