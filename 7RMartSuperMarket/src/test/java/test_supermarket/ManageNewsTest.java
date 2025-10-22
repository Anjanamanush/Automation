package test_supermarket;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import supermarket.ManageNewsClass;
import utilities.ExcellUtilities;

public class ManageNewsTest extends Base {
	HomePageClass home;
	ManageNewsClass managenews;
  @Test
  public void addNews() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  
	  home=loginpageclass.clickLoginButton();
	  managenews=home.clickManageNews();
	  managenews.clickNew().enterNews("Welcome").clickSave();
	  
	  boolean isAlertdisplayed=managenews.isAlertDisplayed();
	  Assert.assertTrue(isAlertdisplayed,"alert not displayed");
  }
}
