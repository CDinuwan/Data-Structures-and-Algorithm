class LinkListApp{
	public static void main(String[] args) {
		LinkListtheList= new LinkList(); // make new list
		theList.insertFirst(22); // insert four items
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);
		theList.displayList(); // display list
		while (!theList.isEmpty()) // until it’s empty,
		{
			Node aNode= theList.deleteFirst(); // delete Node
			System.out.print("Deleted "); // display it
			aNode.displayNode();
			System.out.println("");
		}
		theList.displayList(); // display list
		} // end main()
		} // end class LinkListApp