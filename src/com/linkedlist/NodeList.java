package com.linkedlist;

import java.util.Scanner;

public class NodeList {

	Node head;

	static class Node {
		String data;
		Node next;

		public Node(String d) {
			this.data = d;
			this.next = null;
		}

	}

	public static void main(String args[]) {

		System.out.println("~~~~~~~ Welcome to LinkedList ~~~~~~~");
		NodeList nodeList = new NodeList();
		
		while (true) {
			System.out.print("Please choose any option");
			System.out.println("\n 1)Fetch \n 2)Insert \n 3)Update \n 4)Delete");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				nodeList.fetch(nodeList);
				break;
			case 2:
				nodeList.insert(nodeList);
				System.out.println("The updated List is");
				nodeList.printList(nodeList);
				break;
			case 3:
				nodeList.update(nodeList);
				System.out.println("The updated List is");
				nodeList.printList(nodeList);
				break;
			case 4:
				nodeList.delete(nodeList);
				System.out.println("The updated List is");
				nodeList.printList(nodeList);
				break;
			default:
		           System.err.println("Invalid option selected");
		           System.out.println("Please select from the given options");
			}
		}
	}

	public NodeList insert(NodeList nodeList) {

		System.out.println("Please enter data to insert");
		Scanner sc = new Scanner(System.in);
		java.lang.String data = sc.nextLine();

		if (nodeList.head == null) {
			nodeList.head = new Node(data);
		} else {
			Node last = nodeList.head;
			while (last.next != null) {

				last = last.next;

			}
			last.next = new Node(data);
		}
		return nodeList;

	}

	public void delete(NodeList nodeList) {

		System.out.println("Please enter data to delete");
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();

		Node currNode = nodeList.head, prev = null;

		if (currNode == null) {
			System.out.println("Node cannot be deleted as List is empty");
		} else {

			while (currNode != null && !currNode.data.equalsIgnoreCase(data)) {

				prev = currNode;
				currNode = currNode.next;

			}

			if (currNode != null) {
				prev.next = currNode.next;
			} else {
				System.out.println("Node cannot be found");
			}

		}

	}

	public void update(NodeList nodeList) {
		System.out.println("Please enter old data to update");
		Scanner sc = new Scanner(System.in);
		java.lang.String oldData = sc.nextLine();

		System.out.println("Please enter the new value");
		java.lang.String newData = sc.nextLine();

		Node currNode = nodeList.head;

		if (currNode == null) {
			System.out.println("Node cannot be updated as List is empty");
		} else {

			while (currNode != null && !currNode.data.equalsIgnoreCase(oldData)) {
				currNode = currNode.next;

			}

			if (currNode != null) {
				currNode.data = newData;
			} else {
				System.out.println("Node cannot be found");
			}

		}

	}

	public void printList(NodeList nodeList) {
		Node node = nodeList.head;
		while (node != null) {
			System.out.print(node.data.toString() + "  ");
			node = node.next;
		}
		System.out.println("\n");
	}

	public void fetch(NodeList nodeList) {
		System.out.println("Please select position of data to be fetched");
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();

		if (nodeList.head == null) {
			System.out.println("Node cannot be fetched as List is empty");
		} else {
			Node last = nodeList.head;
			int counter = 0;
			while (last != null) {
				if (counter == position) {
					System.out.println("Node data found at position " + position + ":" + last.data);
					break;
				}
				last = last.next;
				counter++;

			}
			if (position > counter) {
				System.out.println("Node cannot be found at position " + position);
			}
		}

	}

}
