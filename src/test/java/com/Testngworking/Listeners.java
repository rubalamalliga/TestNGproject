package com.Testngworking;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test case is going to execute");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("before everything");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("After everything");
		
	}

	
}
