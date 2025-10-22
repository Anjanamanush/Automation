package supermarket;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class ManageCategoryClass {
	
	WaitUtility waitutility=new WaitUtility();
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	
	public WebDriver driver;
	public ManageCategoryClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement add_new;
	@FindBy(xpath="//input[@id='category']") WebElement enter_category;
	@FindBy(xpath="//li[@id='134-selectable']") WebElement discount;
	@FindBy(xpath="//input[@id='main_img']") WebElement choose_file;
	
	@FindBy(xpath="(//input[@name='top_menu'])[1]") WebElement showon_topmenu_no;
	@FindBy(xpath="(//input[@name='show_home'])[2]") WebElement showon_leftmenu_yes;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement save;
	
	
	public ManageCategoryClass clickAddNew()
	{
		add_new.click();
		return this;
	}
	public ManageCategoryClass clickEnterCategory(String category)
	{
		enter_category.sendKeys(category);
		return this;
	}
	
	public ManageCategoryClass clickDiscount()	{
		discount.click();
		return this;
	}
	public ManageCategoryClass clickChooseFile()
	{
		fileuploadutility.sendKeysForFileUpload(choose_file,Constant.NEW_IMAGEPATH);
		//choose_file.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot (167).png");
		return this;
	}
	public ManageCategoryClass clickShowOnTop()
	{
		showon_topmenu_no.click();
	return this;
	}
	public ManageCategoryClass clickShowOnLeft()
	{
		showon_leftmenu_yes.click();
		return this;
	}
	public ManageCategoryClass clickSave()
	{
		JavascriptExecutor executer=(JavascriptExecutor) driver;
		executer.executeScript("window.scrollBy(0,3000)");
		return this;
		
	}
	public ManageCategoryClass cliksavemethod()
	{
		JavascriptExecutor click=(JavascriptExecutor) driver;
		waitutility.elementToBeClickable(driver, save);
		click.executeScript("agruments[0].click();",save);
		save.click();
		return this;
	}
	
	
	

}
