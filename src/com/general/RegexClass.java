package com.general;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

	public static void main(String args[]){
		RegexClass regexClass = new RegexClass();
		Pattern pattern = Pattern.compile("{0}[a]|{2}[h].*");
		Matcher matcher = pattern.matcher("abhilash");
		boolean val = matcher.find();
		System.out.println(val);
		
	}
	
	public boolean match(String s){
		return s.matches("/^.{2}i/");
		//return true;
	} 
}
