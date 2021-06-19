package resources;

import org.testng.ITestListener;
import org.testng.ITestResult ;

import UnifiedApp.HbUnifiedAutomation.Base;

import java.io.IOException;

import org.testng.ITestContext ;		


public class ListenerTest implements ITestListener{
	 @Override		
	    public void onFinish(ITestContext result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult result) {					
	        // TODO Auto-generated method stub	
	    	//Implement take screenshot code on test failure
	    	String failedname = result.getName();
	    	try {
				Base.getscreenshot(failedname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
	}		


