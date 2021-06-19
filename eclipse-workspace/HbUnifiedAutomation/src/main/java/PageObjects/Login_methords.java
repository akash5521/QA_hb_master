package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login_methords {
	public Login_methords(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	@AndroidFindBy(id= "com.hungerbox.customer.common:id/btn_register")
	public WebElement signup;
	public WebElement getsignup()
	{
		return signup;
	}
	
	@AndroidFindBy(id="com.hungerbox.customer.common:id/btn_sso")
	public WebElement sso;
	public WebElement getsso()
	{
		return sso;
	}
	
	@AndroidFindBy(id="com.hungerbox.customer.common:id/btn_otp")
	public WebElement loginwithotp;
	public WebElement getloginwithotp()
	{
		return loginwithotp;
	}
	
	@AndroidFindBy(xpath="//*[contains(@text='LOG IN')]")
	public WebElement login_btn;
	public WebElement getlogin_btn()
	{
		return login_btn;
	}
	

}
