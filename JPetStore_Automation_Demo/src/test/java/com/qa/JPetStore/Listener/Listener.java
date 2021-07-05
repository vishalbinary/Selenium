package com.qa.JPetStore.Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.qa.JPetStore.utility.TestUtil;

public class Listener   implements ITestListener {
	
	 
	
	public void onTestFailure(ITestResult result) {
	    TestUtil.screenShot();
	    
	  }
	public void onTestStart(ITestResult result) {
		 System.out.println("Listener says, Your Test is Passed (-_-)");
		  }
}
