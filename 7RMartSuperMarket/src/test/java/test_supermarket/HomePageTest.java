package test_supermarket;

import org.testng.Assert;
import org.testng.annotations.Test;

import supermarket.HomePageClass;
import supermarket.LoginpageClass;

public class HomePageTest extends Base {
	HomePageClass home;
  @Test
  public void clickLogout() 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  loginpageclass.enterUsernameAndPassword("admin", "admin");
	  home=loginpageclass.clickLoginButton();
	  home.clikAdmin().clickingLogOutButton();
//	  loginpageclass.clickLoginButton();
//	  
//	  HomePageClass logoutpageclass=new HomePageClass(driver);
//	  logoutpageclass.clikAdmin();
//	  logoutpageclass.clickingLogOutButton();
	  String expected= "Login | 7rmart supermarket";
	  String actual=driver.getTitle();
	  Assert.assertEquals(expected, actual,"not matching");
  }
}
