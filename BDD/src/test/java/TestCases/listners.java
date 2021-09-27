package TestCases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resource.Browser;

public class listners implements ITestListener {
	Browser b = new Browser();
	public void onTestFailure(ITestResult result) {
		
		try {
			b.getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	


	
