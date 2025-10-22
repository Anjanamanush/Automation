package test_supermarket;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import utilities.ExcellUtilities;

public class LoginTest extends Base{
	HomePageClass home;
  @Test
 
  public void verifyValidcredentials() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  home=loginpageclass.clickLoginButton();
	  //loginpageclass.clickLoginButton();
	  boolean isDashboarddisplayed=loginpageclass.isDashboardDisplayed();
	  Assert.assertTrue(isDashboarddisplayed,"Dashboard is Not Displayed");  
  }
  @Test(groups="smoketest")
  @Parameters({"username","password"})
  public void verifyCorrectUsernameIncorrectpassword(String username,String password) 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  loginpageclass.enterUsernameAndPassword(username,password);
	  loginpageclass.clickLoginButton();
	  
  }
  
  @Test(dataProvider = "credentials",groups="smoketest")
  public void verifyIncorrectUsernameCorrectpassword(String username,String password) 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  loginpageclass.enterUsernameAndPassword(username, password);
	  loginpageclass.clickLoginButton();
	  boolean isDashboarddisplayed=loginpageclass.isDashboardDisplayed();
	  Assert.assertTrue(isDashboarddisplayed,"Dashboard is Not Displayed"); 
	  
  }
  @Test
  public void verifyIncorrectusernameAndIncorrectPassword() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(2,0, "loginpage_test");
	  String password=ExcellUtilities.getIntData(2,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  loginpageclass.clickLoginButton();
	  boolean isAlertdisplayed=loginpageclass.isAlertDisplayed();
	  Assert.assertTrue(isAlertdisplayed,"alert not displayed"); 
	  
  }
  
  @DataProvider(name="credentials")
  public Object[][] testData()
  {
	  Object data[][]= {{"admin","admin"},{"carol","1q2w3e4r"}};
	  return data;
		  
  }
}
