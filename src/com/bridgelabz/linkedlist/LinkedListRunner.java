package com.bridgelabz.linkedlist;

public class LinkedListRunner {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList linkedlist = new MyLinkedList();
		
		//add method
		/*linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printLinkedList();
		
		//append method
		linkedlist.append(myThirdNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myFirstNode);
		linkedlist.printLinkedList();*/
		
		//insert method
		linkedlist.append(myThirdNode);
		linkedlist.append(myFirstNode);
		linkedlist.insert(mySecondNode);
		linkedlist.printLinkedList();
	}
}
