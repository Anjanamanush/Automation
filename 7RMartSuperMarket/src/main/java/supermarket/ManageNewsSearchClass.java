package supermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsSearchClass {
	
public WebDriver driver;
	
	public ManageNewsSearchClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='un']") WebElement type_news;
	@FindBy(xpath="//button[@class='btn btn-danger btn-fix']") WebElement clicksearchbtn;
	@FindBy(xpath="//span[@id='res']") WebElement message;
	
	
	public ManageNewsSearchClass typeSearchNews(String news)
	{
		type_news.sendKeys(news);
		return this;
	}
	public ManageNewsSearchClass clickSearchButton()
	{
		clicksearchbtn.click();
		return this;
	}
	public boolean isMessageDisplayed()
	{
		return message.isDisplayed();
	}

}
