package com.Testngworking;

import org.testng.annotations.Test;

public class TestNG_working {
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Tamil");
	}
	@Test(priority = 2)
	public void test2() {
		System.out.println("English");
	}
	@Test(priority = 0)
	public void test3() {
		System.out.println("maths");
	}
	@Test(priority = 3, enabled = false)
	public void test4() {
		System.out.println("science");
	}
	
	
	
}
