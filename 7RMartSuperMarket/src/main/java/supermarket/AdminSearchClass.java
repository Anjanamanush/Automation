package supermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminSearchClass {

public WebDriver driver;
	
	public AdminSearchClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement moreinfo_adminusers;
	//Search
		
		@FindBy(xpath="//input[@id='un']") WebElement search_username;
		@FindBy(xpath="//select[@id='ut']") WebElement search_usertype;
		@FindBy(xpath="(//button[@class='btn btn-block-sm btn-danger'])[1]") WebElement click_search;
		@FindBy(xpath="//span[@id='res']") WebElement message;
		
		
		public AdminSearchClass selectUsernameUsertype(String search_usrname,String search_usrtype)
		{
			Select select=new Select(search_usertype);
			search_username.sendKeys(search_usrname);
			select.selectByValue(search_usrtype);
			return this;
		}
		public AdminSearchClass clickSearchButton()
		{
			click_search.click();
			return this;
		}
		public boolean isMessageDisplayed()
		{
			return message.isDisplayed();
		}
		
}
