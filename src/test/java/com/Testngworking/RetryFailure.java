package com.Testngworking;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailure implements IRetryAnalyzer {
	
	int failure = 0;
	int limit =4;
	

	public boolean retry(ITestResult result) {
		
		if(failure<limit) {
			failure++;
		return true;
		}
			
		
		return false;
	}

	
}
