package StackProblems;

import org.junit.Assert;
import org.junit.Test;

import LinkedListProblems.INode;
import LinkedListProblems.MyLinkedListTest;
import LinkedListProblems.MyNode;

public class MyStackTest {
	@Test
	public void test() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack = new MyStack();
		
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode pop = myStack.pop();
		myStack.printStack();
		INode peak = myStack.peak();
		Assert.assertEquals(myThirdNode,pop);
		Assert.assertEquals(mySecondNode,peak);
	}
}
