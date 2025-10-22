package test_supermarket;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import supermarket.ManageNewsClass;
import supermarket.ManageNewsSearchClass;
import utilities.ExcellUtilities;

public class ManageNewsSearchTest extends Base{
	HomePageClass home;
	ManageNewsClass managenews;
	ManageNewsSearchClass managesearch;
  @Test
  public void manageNewsSearchMethod() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  
	  home=loginpageclass.clickLoginButton();
	  managenews=home.clickManageNews();
	  managesearch=managenews.clickSearch();
	  managesearch.typeSearchNews("anjana").clickSearchButton();
	  
	  ManageNewsSearchClass managesearchclass=new ManageNewsSearchClass(driver);
	  boolean isMessageDisplayed=managesearchclass.isMessageDisplayed();
	  Assert.assertTrue(isMessageDisplayed,"Message Not Displayed");
  }
}
