package com.Testngworking;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assertions {
	
	
@Test(retryAnalyzer = RetryFailure.class)
	
	public void assert1() {
	Assert.assertEquals(true,false);
	}

@Test
public void assert2() {
	Assert.assertEquals(true,false);
	}
}
