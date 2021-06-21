package UnifiedApp.HbUnifiedAutomation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;


import PageObjects.Select_Enviroment;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.internal.Config;

public class EnvSetup extends Base
{
@Test(dataProvider = "InputData",dataProviderClass = DataParametrisation.class)
public void selectServer(String data) throws IOException, InterruptedException
{
	service = StartServer();
	AndroidDriver<AndroidElement> driver = capabilities("UnifiedApp");
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Select_Enviroment se = new Select_Enviroment(driver);
	se.getSelect_Enviroment().click();
	se.getcompany_name().sendKeys(data);
	se.getnext_btn().click();
	
	

}
}
