package supermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageClass {

	public WebDriver driver;
	
	public LoginpageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement sign_in;
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alertmsg;
	
	public LoginpageClass enterUsernameAndPassword(String usrnme,String paswrd)
	{
		username.sendKeys(usrnme);
		password.sendKeys(paswrd);
		return this;
	}
	public HomePageClass clickLoginButton()
	{
		sign_in.click();
		return new HomePageClass(driver);
		
	}
	public boolean isDashboardDisplayed( )
	{
		return dashboard.isDisplayed();
	}
	public boolean isAlertDisplayed( )
	{
		return alertmsg.isDisplayed();
	}
	
}
