package test_supermarket;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import supermarket.AdminUserPageClass;
import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import utilities.ExcellUtilities;
import utilities.Faker_Utility;

public class AdminUserPageTest extends Base {
	HomePageClass home;
	AdminUserPageClass adminuser;
	Faker_Utility fake=new Faker_Utility();
	
  @Test
  public void adminUserMoreInfo() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  
	  home=loginpageclass.clickLoginButton();
	  adminuser=home.clickMoreInfoAdminusers();
//	  String Username=ExcellUtilities.getStringData(1,0, "adminuser_test");
//	  String Password=ExcellUtilities.getStringData(1,1, "adminuser_test");
	  String user_type=ExcellUtilities.getStringData(1, 2, "adminuser_test");
	  
	  String Userna=fake.firstName();
	  String Pswd=fake.password();
	  adminuser.clickNew().selectUsernamepassword(Userna, Pswd).selectUserType(user_type).clicksave();
	 
	  /*
	  loginpageclass.clickLoginButton();
	  
	  AdminUserPageClass adminuserpageclass = new AdminUserPageClass(driver);
	  String Username=ExcellUtilities.getStringData(1,0, "adminuser_test");
	  String Password=ExcellUtilities.getStringData(1,1, "adminuser_test");
	  String user_type=ExcellUtilities.getStringData(1, 2, "adminuser_test");
	  
	  adminuserpageclass.clickMoreInfoAdminusers();
	  adminuserpageclass.clickNew();
	  adminuserpageclass.selectUsernamepassword(Username, Password);
	  adminuserpageclass.selectUserType(user_type);
	  adminuserpageclass.clicksave();*/
	  boolean isAlertdisplayed=loginpageclass.isAlertDisplayed();
	  Assert.assertTrue(isAlertdisplayed,"alert not displayed"); 
	  
  }
}
