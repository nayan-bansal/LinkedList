package Linked_List;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyNodeTest {

	@Test
	public void testForLinkedList() {
	
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
		
	}

}
