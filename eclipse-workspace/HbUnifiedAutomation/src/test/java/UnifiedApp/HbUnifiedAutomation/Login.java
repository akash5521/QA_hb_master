package UnifiedApp.HbUnifiedAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service;

import PageObjects.Login_methords;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class Login extends Base
{
@Test
public void LoginPage() throws IOException, InterruptedException
{
	service = StartServer();
	AndroidDriver<AndroidElement> driver = capabilities("UnifiedApp");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Login_methords log = new Login_methords(driver);
	log.getlogin_btn().click();
	
	
}
	

}
