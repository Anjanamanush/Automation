package test_supermarket;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import supermarket.AdminSearchClass;
import supermarket.AdminUserPageClass;
import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import utilities.ExcellUtilities;

public class AdminSearchTest extends Base {
	HomePageClass home;
	AdminUserPageClass admin;
	AdminSearchClass adminsearch;
  @Test
  public void searchForUsers() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  
	  String user_name=ExcellUtilities.getStringData(2,0, "admin_search");
	  String userType=ExcellUtilities.getStringData(2,1,"admin_search");
	  
	  home=loginpageclass.clickLoginButton();
	  admin=home.clickMoreInfoAdminusers();
	  adminsearch=admin.clickSearch();
	  adminsearch.selectUsernameUsertype(user_name,userType).clickSearchButton();
			  
			  
			  
			  
			  
	 // loginpageclass.enterUsernameAndPassword("admin", "admin");
	 // loginpageclass.clickLoginButton();
	  
//	  AdminUserPageClass adminuserpageclass = new AdminUserPageClass(driver);
	 
	 // adminuserpageclass.clickMoreInfoAdminusers();
	  
	  AdminSearchClass adminsearchclass=new AdminSearchClass(driver);
//	  adminsearchclass.clickSearch();
//	  adminsearchclass.selectUsernameUsertype(user_name, userType);
//	  adminsearchclass.clickSearchButton();
	  boolean isMessageDisplayed=adminsearchclass.isMessageDisplayed();
	  Assert.assertTrue(isMessageDisplayed,"Message Not Displayed");
  }
}
