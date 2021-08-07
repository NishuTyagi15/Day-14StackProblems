package StackProblems;

import LinkedListProblems.INode;
import LinkedListProblems.MyLinkedListTest;

public class MyStack {
	private final MyLinkedListTest myLinkedListTest;
	
	public MyStack() {
		this.myLinkedListTest = new MyLinkedListTest();
	}
	
	public void push(INode myNode) {
		myLinkedListTest.add(myNode);
	}

	public void printStack() {
		myLinkedListTest.printMyNodes();// TODO Auto-generated method stub	
	}
	
	public INode peak() {
		return myLinkedListTest.head; // TODO Auto-generated method stub
	}

	public INode pop() {
		return myLinkedListTest.pop(); // TODO Auto-generated method stub	
	}
}