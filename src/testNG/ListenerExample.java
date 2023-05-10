package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("Test case is Finished...");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Test case is intially Started...");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Test case is failed with Success Percentage...");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Test case is Failed...");
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test case is Skipped...");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test case is going to execute...");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test case is Successfully Completed...");
		
	}
	
	

}
