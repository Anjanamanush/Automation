package supermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Page_Utility;

public class AdminUserPageClass {
	
	public WebDriver driver;
	Page_Utility pageutility=new Page_Utility();
	
	public AdminUserPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement click_new;
	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//select[@id='user_type']") WebElement userType;
	
	@FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[2]") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement alert_msg;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search_button;

	
	public AdminUserPageClass clickNew()
	{
		click_new.click();
		return this;
	}
	public AdminUserPageClass selectUsernamepassword(String Username,String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		return this;
		
	}
	public AdminUserPageClass selectUserType(String value)
	{
		pageutility.selectByValue(userType,value);
		return this;
	}
	public AdminUserPageClass clicksave()
	{
		save.click();
		return this;
	}

	public boolean isAlertDisplayed( )
	{
		return alert_msg.isDisplayed();
	}
	
	
	public AdminSearchClass clickSearch()
	{
		search_button.click();
		return new AdminSearchClass(driver);
	}
	
	
	
}
