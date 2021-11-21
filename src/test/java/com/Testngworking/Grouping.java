package com.Testngworking;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups= {"Apple"})
	public void apple1() {	
		System.out.println("Test 1");
	}
	@Test(groups= {"Apple"})	
	public void apple2() {
		System.out.println("Test 1");
}
	@Test(groups= {"Oppo"})
	public void oppo1() {
		System.out.println("Test 2");
}
	@Test(groups= {"Oppo"})
	public void oppo2() {
		System.out.println("Test 2");
	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("Test 3");
	}
	@Test(groups= {"Vivo"})
	public void vivo2() {
		System.out.println("Test 3");
	}
	@Test(groups= {"samsung"})
	public void samsung1() {
		System.out.println("Test 4");
	}
	@Test(groups= {"samsung"})
	public void samsung2() {
		System.out.println("Test 4");
	}
}