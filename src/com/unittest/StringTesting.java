package com.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTesting {

	
	@Test
	public void testComparFunct() {
		Logic1Class logical1Class = new Logic1Class();
		assertTrue(logical1Class.comparFunct("s1","s2"));
	}

}
