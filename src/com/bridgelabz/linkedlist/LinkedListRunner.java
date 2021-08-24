package com.bridgelabz.linkedlist;

public class LinkedListRunner {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList linkedlist = new MyLinkedList();
		
		/*add method
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);*/
		
		//append method
		linkedlist.append(myThirdNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myFirstNode);
		
		/*insert method
		linkedlist.append(myThirdNode);
		linkedlist.append(myFirstNode);
		linkedlist.insert(mySecondNode);*/
		
		//pop first element
		linkedlist.popFirst();
		linkedlist.printLinkedList();
	}
}
