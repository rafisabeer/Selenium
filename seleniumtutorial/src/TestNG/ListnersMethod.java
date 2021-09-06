package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListnersMethod implements ITestListener{
	@Override
	public void onFinish(ITestContext arg0) {
System.out.println("is this finish");		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("is this Start");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Success precentage");		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("is this failure");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("skipped");		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("listeners");		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("is this success");		
	}

	
}
