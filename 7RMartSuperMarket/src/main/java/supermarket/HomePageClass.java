package supermarket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {

	public WebDriver driver;
	
	public HomePageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='dropdown-item'])[2]") WebElement logout;
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	WebElement admin_image;
	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement moreinfo_adminusers;
	@FindBy(xpath="(//a[@class='small-box-footer'])[9]") WebElement manage_category;
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[7]") WebElement manage_news;
	@FindBy(xpath="(//a[@class='small-box-footer'])[6]") WebElement manage_product;
	
	public HomePageClass clikAdmin()
	{
		admin_image.click();
		return this;
	}
	
	public HomePageClass clickingLogOutButton()
	{
		logout.click();
		return this;
	}
	public AdminUserPageClass clickMoreInfoAdminusers()
	{
		moreinfo_adminusers.click();
		return new AdminUserPageClass(driver);
	}
	public ManageCategoryClass clickManageCategory()
	{
		manage_category.click();
		return new ManageCategoryClass(driver);
	}
	
	public ManageNewsClass clickManageNews()
	{
		manage_news.click();
		return new ManageNewsClass(driver);
	}
	public ManageProductClass clickManageProduct()
	{
		manage_product.click();
		return new ManageProductClass(driver);
	}
}
