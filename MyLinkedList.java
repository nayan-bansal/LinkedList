package Linked_List;

public class MyLinkedList {

public INode head;
public INode tail;

public MyLinkedList() {
	this.head = null;
	
	this.tail = null;
}

public void add(INode node) {

	if(this.tail == null)
		this.tail = node;
	else if(this.head == null)
		this.head = node;
	else {
		INode temp = this.head;
		this.head = node;
		this.head.setNext(temp);
	}
}

public void printnodes() {
	StringBuilder mynodes = new StringBuilder("My Nodes :");
	INode temp = head;
	while(temp.getNext() != null) {
		mynodes.append(temp.getKey());
		
		if(!temp.equals(tail))
			mynodes.append("---");
		temp = temp.getNext();
	}
	
	mynodes.append(temp.getKey());
	System.out.println(mynodes);
	
}

public void append(INode node) {
	if(this.head == null)
		this.head = node;
	else if(this.tail == null)
		this.tail = node;
	else {
		this.tail.setNext(node);
		this.tail = node;
	}
}

}