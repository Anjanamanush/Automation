package supermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsClass {

	public WebDriver driver;
	
	public ManageNewsClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement clicknew;
	@FindBy(xpath="//textarea[@id='news']") WebElement enter_news;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert_mesg;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search_click;
	
	public ManageNewsClass clickNew()
	{
		clicknew.click();
		return this;
	}
	public ManageNewsClass enterNews(String news)
	{
		enter_news.sendKeys(news);
		return this;
	}
	public ManageNewsClass clickSave()
	{
		save.click();
		return this;
	}
	public boolean isAlertDisplayed( )
	{
		return alert_mesg.isDisplayed();
	}
	public ManageNewsSearchClass clickSearch()
	{
		search_click.click();
		return new ManageNewsSearchClass(driver) ;
	}
	
}
