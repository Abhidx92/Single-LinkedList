package com.unittest;

public class Logic1Class {

	
	
	public static void main(String args[]){
		Logic1Class logic1Class = new Logic1Class();
		String literal1 = "Abhilash";
		String literal2 = "Abhilash";
		String nObject = new String("Abhilash");
		boolean val = logic1Class.comparFunct(literal1,nObject);
		System.out.println(val);
	}
	
	boolean comparFunct(String s1, String s2){
		return s1 ==  s2;
		//System.out.println(s1.equalsIgnoreCase(s2));
	
		
	}
}
