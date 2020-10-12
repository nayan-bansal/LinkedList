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

public void insert(INode myNode, INode newNode) {
	INode tempNode = myNode.getNext();
	myNode.setNext(newNode);
	newNode.setNext(tempNode);
}

public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;

	}

public INode popLast() {
		INode tempNode = this.head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
public INode search(Integer key) {
		INode tempNode = this.head;
		INode found = null;
		while (tempNode != null && tempNode.getNext() != null) {
			if (tempNode.getKey() == key) {
				found = tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return found;
	}
public void removeParticularNode(INode deleteNode) {
		INode tempNode = this.head;
		INode prev = null;
		while (tempNode != null && tempNode.getKey() != deleteNode.getKey()) {
			prev = tempNode;
			tempNode = tempNode.getNext();
		}
		prev.setNext(tempNode.getNext());
		tempNode.setNext(null);
	}
public int size() {
		int size = 0;
		INode n = head;
		while (n != null) {
			size++;
			n = n.getNext();
		}
		return size;

	}
public <K extends Comparable<K>> void sortList() {
		INode<K> current = this.head;
		INode<K> index = null;
		K temp;
		if (this.head == null)
			return;
		else {
			while (current != null) {
				index = current.getNext();
				while (index != null) {
					if (maximum(index.getKey(), current.getKey())) {
						temp = current.getKey();
						current.setKey(index.getKey());
						index.setKey(temp);
					}
					index = index.getNext();
				}
				current = current.getNext();
			}
		}
	}
}
