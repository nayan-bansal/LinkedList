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

}
