package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	Node head;
	String a = "roy";
	List listnwew =  new ArrayList<>();
	 class Node {
		String data;
		Node next;

		public Node(String d) {
			this.data = d;
			this.next = null;
		}

	}
	public static void main(String args[]){
		/*EncapExample encapExample = new EncapExample();
		encapExample.setFirst_name("Abhilash");
		System.out.println("First name is:" + encapExample.getFirst_name());
		*/
		MainClass mainClass =  new MainClass();
		
		mainClass.head = mainClass.new Node("roy");
		System.out.println("Printing head befor anything " + mainClass.head.data);
		Node n = mainClass.head;
		n.data = "amit";
		String b = mainClass.a;
		b = b + "dadadada";
		
		mainClass.listnwew.add("roy");
		List listMod = mainClass.listnwew;
		//listMod.remove(0);
		System.out.println("Printing modList " + listMod.toString() + "Printing newList" + mainClass.listnwew.toString());
		
		
		System.out.println("Printing original " + mainClass.head.data);
		System.out.println("Printing modified " + n.data);
		System.out.println("Printing string a " + mainClass.a);
	
}}
