package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Select_Enviroment {
	public Select_Enviroment(AndroidDriver<AndroidElement>driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(xpath = "//*[@text='RC']")
	public WebElement chooseServer;
	public WebElement getSelect_Enviroment()
	{
		return chooseServer;
	}


	@AndroidFindBy(id="com.hungerbox.customer.common:id/edQR")
	public WebElement Enter_company_name;
	public WebElement getcompany_name()
	{
		return Enter_company_name;
	}

	
	@AndroidFindBy(id="com.hungerbox.customer.common:id/go")
	public WebElement Next_btn;
	public WebElement getnext_btn()
	{
		return Next_btn;
	}

	
	
}

