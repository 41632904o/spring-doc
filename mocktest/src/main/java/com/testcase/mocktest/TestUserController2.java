package com.testcase.mocktest;


import junit.framework.TestCase;

public class TestUserController2 extends TestCase {
	String name = "", address =" ";

	@Override
	protected void setUp() throws Exception {
		name = "name1";
		address = "addr1";
	}

	@Override
	protected void tearDown() throws Exception {
		name = "";
		address = "";
	}

	
	 
	
	
}
