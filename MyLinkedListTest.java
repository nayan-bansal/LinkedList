package Linked_List;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyLinkedListTest {

@Test 
public void givenNumberShouldbeAtTop() {
	MyNode<Integer> myFirstNode = new MyNode<>(56);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(70);
	
	MyLinkedList linkedlist = new MyLinkedList();
	linkedlist.add(myFirstNode);
	linkedlist.add(mySecondNode);
	linkedlist.add(myThirdNode);
	
	boolean result  = linkedlist.head.equals(myThirdNode) && linkedlist.head.getNext().equals(mySecondNode) && linkedlist.tail.equals(myFirstNode);
	
	Assert.assertTrue(result);
	
	
}

@Test 
public void givenNumberShouldbeAtTopappend() {
	MyNode<Integer> myFirstNode = new MyNode<>(56);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(70);
	
	MyLinkedList linkedlist = new MyLinkedList();
	linkedlist.add(myFirstNode);
	linkedlist.append(mySecondNode);
	linkedlist.append(myThirdNode);
	
	boolean res  = linkedlist.head.equals(myFirstNode) && 
						linkedlist.head.getNext().equals(mySecondNode) && 
						linkedlist.tail.equals(myThirdNode);
	
	Assert.assertTrue(res);
}

@Test
public void given3NumbersInsertSecondInBetweenShouldPassTest() {
	MyNode<Integer> myFirstNode = new MyNode<>(56);
	MyNode<Integer> mySecondNode = new MyNode<>(30);
	MyNode<Integer> myThirdNode = new MyNode<>(70);
	MyLinkedList myLinkedList = new MyLinkedList();
	myLinkedList.add(myFirstNode);
	myLinkedList.append(myThirdNode);
	myLinkedList.insert(myFirstNode, mySecondNode);
	myLinkedList.printnodes();
	boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
			&& myLinkedList.tail.equals(myThirdNode);
	Assert.assertTrue(result);
}

@Test
	public void givenFirstElementWhenDeletedShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode deletedNode = myLinkedList.pop();
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode)
				&& myLinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
@Test
	public void givenThirdElementWhenDeletedShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode deletedNode = myLinkedList.popLast();
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}
@Test
	public void givenElementWhenSearchShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		INode found = myLinkedList.search(mySecondNode.getKey());
		boolean result = myLinkedList.head.equals(found) || myLinkedList.head.getNext().equals(found)
				|| myLinkedList.tail.equals(found);
		Assert.assertTrue(result);
	}@Test
	public void givenElementWhenInsertedafterSomeNodeShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myFourthNode);
		INode found = myLinkedList.search(mySecondNode.getKey());
		myLinkedList.insert(found, myThirdNode);
		// myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) && myFirstNode.getNext().equals(mySecondNode)
				&& mySecondNode.getNext().equals(myThirdNode) && myLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}
@Test
	public void givenElementWhenDeletedAfterSearchShouldPassTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.printMyNode();
		INode found = myLinkedList.search(myThirdNode.getKey());
		myLinkedList.removeParticularNode(found);
		myLinkedList.printMyNode();
		int size = myLinkedList.size();
		System.out.println("size of LL " + size);
	}
@Test
	public void givenListOfElementsGetSortedList() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.printMyNode();
		myLinkedList.sortList();
		myLinkedList.printMyNode();
		boolean result = myLinkedList.head.equals(myFirstNode) && myFirstNode.getNext().equals(mySecondNode)
				&& mySecondNode.getNext().equals(myThirdNode) && myLinkedList.tail.equals(myFourthNode);
		Assert.assertTrue(result);
	}
}
