package test_supermarket;

import java.io.IOException;

import org.testng.annotations.Test;

import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import supermarket.ManageCategoryClass;
import utilities.ExcellUtilities;

public class ManageCategoryTest extends Base {
	HomePageClass home;
	ManageCategoryClass manage;
  @Test(retryAnalyzer = retry.Retry.class)
  public void addNewCategory() throws IOException{
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  
	  home=loginpageclass.clickLoginButton();
	  manage=home.clickManageCategory();
	  manage.clickAddNew().clickEnterCategory("banana").clickDiscount().clickChooseFile().clickShowOnTop().clickSave().cliksavemethod();
	  
	 /* loginpageclass.clickLoginButton();
	  
	  ManageCategoryClass managecategoryclass=new ManageCategoryClass(driver);
	  managecategoryclass.clickManageCategory();
	  managecategoryclass.clickAddNew();
	  managecategoryclass.clickEnterCategory("avocado");
	  managecategoryclass.clickDiscount();
	  managecategoryclass.clickChooseFile();
//	  managecategoryclass.clickShowOnTop();
	  managecategoryclass.clickShowOnLeft();
	  managecategoryclass.clickSave();
	  managecategoryclass.cliksavemethod();*/
	  
  }
}
