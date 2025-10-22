package supermarket;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.FileUploadUtility;
import utilities.Page_Utility;
import utilities.WaitUtility;

public class ManageProductClass {
	
	public WebDriver driver;
	Page_Utility pageutility=new Page_Utility();
	FileUploadUtility fileuploadutility=new FileUploadUtility();
	WaitUtility waitutility=new WaitUtility();
	
	public ManageProductClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement add_new;
	@FindBy(xpath="//input[@id='title']") WebElement title;
	@FindBy(xpath="(//input[@name='type'])[2]") WebElement product_type;
	@FindBy(xpath="//input[@id='tag']") WebElement tagname;
	@FindBy(xpath="//select[@id='cat_id']") WebElement select_category;
	@FindBy(xpath="//select[@id='sub_id']") WebElement select_subcategory; 
	@FindBy(xpath="//select[@id='grp_id']") WebElement select_group;
	@FindBy(xpath="//input[@id='purpose1']") WebElement price_type;
	@FindBy(xpath="//input[@id='m_weight']") WebElement weight_value;
	@FindBy(xpath="//select[@id='w_unit']") WebElement slct_weight_unit;
	@FindBy(xpath="//input[@id='max_weight']") WebElement max_quantity_can_order;
	@FindBy(xpath="//input[@id='w_price']") WebElement enter_price;
	@FindBy(xpath="//input[@id='w_mrp']") WebElement enter_mrp;
	@FindBy(xpath="//input[@id='w_stock']") WebElement stock_availability;
	@FindBy(xpath="//input[@id='w_pp']") WebElement purchase_price;
	@FindBy(xpath="//input[@name='unlimitw[]']") WebElement unlimited_stock_checked;
	@FindBy(xpath="//div[@class='note-editable card-block']") WebElement description;
	@FindBy(xpath="(//input[@name='stock'])[1]") WebElement stock_yes;
	@FindBy(xpath="//input[@id='main_img']") WebElement choose_file;
	@FindBy(xpath="//input[@id='main_imgs']") WebElement choose_subfile;
	@FindBy(xpath="(//input[@name='featured'])[1]") WebElement featured_yes;
	@FindBy(xpath="(//input[@name='combo'])[1]") WebElement combopack_yes;
	@FindBy(xpath="//button[@class='btn btn-danger']") WebElement click_save;
	@FindBy(xpath="//a[@class='btn btn-default btn-fix']") WebElement click_cancel;
	
	
	
	public ManageProductClass clickAddNew()
	{
		add_new.click();
		return this;
	}
	public ManageProductClass enterTitle(String Title)
	{
		title.sendKeys(Title);
		return this;
	}
	public ManageProductClass selectproductType()
	{
		product_type.click();
		return this;
	}
	public ManageProductClass enterTag(String Tag)
	{
		tagname.sendKeys(Tag);
		return this;
	}
	public ManageProductClass selectcategory(String value)
	{
		pageutility.selectByVisibleText(select_category,value);
		return this;
	}
	public ManageProductClass selectSubcategory(String value)
	{
		pageutility.selectByVisibleText(select_subcategory,value);
		return this;
	}
	public ManageProductClass selectGroup(String value)
	{
		pageutility.selectByValue(select_group,value);
		return this;
	}
	public ManageProductClass priceTypeMethod()
	{
		price_type.click();
		return this;
	}
	public ManageProductClass enterWeightValue(String weightval)
	{
		weight_value.sendKeys(weightval);
		return this;
	}
	public ManageProductClass selectWeightUnit(String value)
	{
		pageutility.selectByValue(slct_weight_unit,value);
		return this;
	}
	public ManageProductClass enterMaxQuantitycanOrder(String maxquanity)
	{
		max_quantity_can_order.sendKeys(maxquanity);
		return this;
	}
	public ManageProductClass enterPrice(String price)
	{
		enter_price.sendKeys(price);
		return this;
	}
	public ManageProductClass enterMRP(String mrp)
	{
		enter_mrp.sendKeys(mrp);
		return this;
	}
	public ManageProductClass enterStockAvailability(String stock_avail)
	{
		stock_availability.sendKeys(stock_avail);
		return this;
	}
	public ManageProductClass enterPurchasePrice(String purchasePrice)
	{
		purchase_price.sendKeys(purchasePrice);
		return this;
	}
	public ManageProductClass unlimtedStockUnchecked() 
	{
		unlimited_stock_checked.click();
		return this;
	}
	public ManageProductClass enterDescription(String descrip)
	{
		description.sendKeys(descrip);
		return this;
	}
	public ManageProductClass clickStockNo()
	{
		stock_yes.click();
		return this;
	}
	public ManageProductClass chooseFile()
	{
		fileuploadutility.sendKeysForFileUpload(choose_file,Constant.NEW_IMAGEPATH);
		return this;
	}
	public ManageProductClass choose_SubFile()
	{
		fileuploadutility.sendKeysForFileUpload(choose_subfile,Constant.NEW_IMAGEPATH);
		return this;
	}
	public ManageProductClass featuredYes()
	{
		featured_yes.click();
		return this;
	}
	public ManageProductClass comboPackYes()
	{
		combopack_yes.click();
		return this;
	}
	public ManageProductClass clickSave()
	{
		JavascriptExecutor executer=(JavascriptExecutor) driver;
		executer.executeScript("window.scrollBy(0,4000)");
		return this;		
	}
	public ManageProductClass clickSaveMethod()
	{
		JavascriptExecutor click=(JavascriptExecutor) driver;
		waitutility.elementToBeClickable(driver, click_save);
		click.executeScript("agruments[0].click();",click_save);
		click_save.click();
		return this;
	}
	public ManageProductClass clickcancel()
	{
		JavascriptExecutor click=(JavascriptExecutor) driver;
		waitutility.elementToBeClickable(driver, click_cancel);
		click.executeScript("agruments[0].click();",click_cancel);
		click_cancel.click();
		return this;
	}
}
