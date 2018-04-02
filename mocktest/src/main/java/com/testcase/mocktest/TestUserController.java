package com.testcase.mocktest;

import junit.framework.TestCase;

public class TestUserController extends TestCase {
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

	
	
	public void testprint(){
		System.out.println(name+ "," + address);
	}
	
	
	public void testprint2(){
		System.out.println(name+ "," + address);
	}
	
	
	
}
