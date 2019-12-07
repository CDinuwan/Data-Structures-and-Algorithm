NODE CLASS



class Node
{
	public int iData;//Data Item
	public Node next;//next link in list

	public Node(int id)//constructor
	{
		iData=id;//initialize data
	}
	public void displayNode()//display ourself
	{
		System.out.println("Data:"+iData);
	}
}


LINKLIST CLASS


class LinkList
{	
	private Node first;//ref to first Node on List
	public void Linklist()//constructor
	{
		first=null;//no items on list yet
	}
	public boolean isEmpty()true if list is empty
	{
		return(first==null);
	}
}


INSERTION


public void insertFirst(int id)//make new Node
{
	Node newNode=new Node(id);
	newNode.next=frist;//newNode--old first
	first=newNode//first--newNode
}


DELETION



public Node deleteFirst()
// delete first item (assumes list not empty)
{
Node temp = first; // save reference to Node
first = first.next; // delete it: first-->old next
temp.next= null; // set the temp’s next to null
return temp; // return deleted Node
}



INSERTION



public void displayList()
{
	System.out.print("List (first-->last): ");
	Node current = first; // start at beginning of list
	while(current != null) // until end of list,
	{
		current.displayNode(); // print data
		current = current.next; // move to next node
	}
	System.out.println("");
	}


SEARCHING


public Node find(intvalue) // find link with given value
	{ // (assumes non-empty list)
		Node current = first; // start at ‘first’
		while (current.iData!= value) // while no match,
	{
		if (current.next== null) // if end of list,
		{
			return null; // didn’t find it
		}
		else // not end of list,
		{
		current = current.next; // go to next Node
		}
	}
	return current; // found it
	}



DELETING SPECIFIED NODES

	public Node delete(intvalue) // delete Node with given Value
	{ // (assumes non-empty list)
	Node current = first; // search for Node
	Node previous = first;
	while (current.iData!= value) {
		if (current.next== null)
	{
		return null; // didn’t find it
	}
		else
	{
		previous = current; // go to next Node
		current = current.next;
	}
	} // found it
	if (current == first) // if first Node,
	{
		first = first.next; // change first
	}
	else // otherwise,
	{
		previous.next= current.next; // bypass it
	}
	return current;
	}