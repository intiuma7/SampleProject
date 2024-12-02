package listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import reports.Reporter;

public class ListenerClass implements ITestListener,ISuiteListener{
	
	ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
	
		Reporter.intiReports();	
	}

	@Override
	public void onFinish(ISuite suite) {

			try {
				Reporter.fulshReport();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	@Override
	public void onTestStart(ITestResult result) {
		 test=Reporter.createTest(result.getMethod().getMethodName());
	
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
			test.pass(result.getMethod().getMethodName()+" is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		//	ExtentLogger.fail(result.getMethod().getMethodName()+" is failed");
		//	ExtentLogger.fail(result.getThrowable().toString());
		//it gives array of the method but we need a string so we used Arrays.toString to change it as string
	//		ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//	ExtentLogger.skip(result.getMethod().getMethodName()+" is skipped");
		}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {

		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {

		ITestListener.super.onFinish(context);
	}

}
