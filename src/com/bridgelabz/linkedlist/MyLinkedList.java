package com.bridgelabz.linkedlist;

public class MyLinkedList <K>{

	private INode head;
	private INode tail;
	
	public MyLinkedList(){
		this.head=null;
		this.tail=null;
	}
	
	public void add(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} 
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}		
	}
	
	
	public void append(INode newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public void insert(INode newNode) {
		this.head.setNext(newNode);
		newNode.setNext(this.tail);		
	}
	
	public void popFirst() {
		INode tempNode = head.getNext();
		this.head = tempNode;
	}
	
	public void popLast() {
		INode tempNode = this.head;
		while (tempNode.getNext() != tail) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode.setNext(null);
	}
	
	public void search(K key) {
		INode tempNode = this.head;
		while (tempNode != tail) {
			if(tempNode.getKey() == key) {
				System.out.println(key+ " is present ");
				break;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void printLinkedList() {
		StringBuffer printformat = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode != null) {
			printformat.append(tempNode.getKey());
			if (tempNode != tail) {
				printformat.append("-->");
			}
			tempNode = tempNode.getNext();
		}
		System.out.println(printformat);
	}

}
