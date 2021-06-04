package UnifiedApp.HbUnifiedAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import java.net.Socket;
import java.net.ServerSocket;

public class Base {
	// Programitically start the server
	
	public static AppiumDriverLocalService service;
	public AppiumDriverLocalService StartServer()
	{
		//Check if server is already started at 4723, don't again run the server
		
		boolean cheserver = checkIfServerIsRunnning(4723);
		if(!cheserver)
		{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		}
		return service;
	}
	
	//Java Socket programming for server start and stop
	public boolean checkIfServerIsRunnning(int port) {

	    boolean isServerRunning = false;
	    ServerSocket serverSocket;
	    try {
	        serverSocket = new ServerSocket(port);
	        serverSocket.close();
	    } catch (IOException e) {
	        //If control comes here, then it means that the port is in use
	        isServerRunning = true;
	    } finally {
	        serverSocket = null;
	    }
	    return isServerRunning;
	}
	
	
	public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException
	{
		//This brings the apk file from global.properties 
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		AndroidDriver<AndroidElement> driver;
		File appDir = new File("src");
		File app = new File(appDir,(String) prop.get(appName));
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//From global.properties file we are bringing the device name in which we want 
		//Test to run
		
		String listdevice= (String) prop.get("device");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,listdevice);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(19, TimeUnit.SECONDS);
		
		return driver;
		
		
		
		
	}

}
