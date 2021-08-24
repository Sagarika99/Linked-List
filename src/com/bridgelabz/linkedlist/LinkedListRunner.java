package com.bridgelabz.linkedlist;

public class LinkedListRunner {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList linkedlist = new MyLinkedList();
		
		//append method
		linkedlist.append(myThirdNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myFirstNode);
		
		//pop last element
		linkedlist.search(30);
		linkedlist.printLinkedList();
		
		
	}
}
