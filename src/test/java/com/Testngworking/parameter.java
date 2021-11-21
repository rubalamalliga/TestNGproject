package com.Testngworking;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {

	@Test
	@Parameters({"Name","Name1"})
	public void printname(String name, String name1) {
		System.out.println("Name is "+name);
		System.out.println("Name is "+name1);
	}
}
