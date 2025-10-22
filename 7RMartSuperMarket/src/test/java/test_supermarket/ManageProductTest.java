package test_supermarket;

import java.io.IOException;

import org.testng.annotations.Test;

import supermarket.HomePageClass;
import supermarket.LoginpageClass;
import supermarket.ManageProductClass;
import utilities.ExcellUtilities;

public class ManageProductTest extends Base {
	HomePageClass home;
	ManageProductClass manageproduct;
  @Test
  public void manageProductAddmMethod() throws IOException 
  {
	  LoginpageClass loginpageclass=new LoginpageClass(driver);
	  String username=ExcellUtilities.getStringData(1,0, "loginpage_test");
	  String password=ExcellUtilities.getStringData(1,1, "loginpage_test");
	  loginpageclass.enterUsernameAndPassword(username, password);
	  
	  home=loginpageclass.clickLoginButton();
	  manageproduct=home.clickManageProduct();
	  manageproduct.clickAddNew().enterTitle("product").selectproductType().enterTag("pdt").selectcategory("Select").selectSubcategory("Select").selectGroup("134")
	  .enterWeightValue("65465").selectWeightUnit("kg").enterMaxQuantitycanOrder("1000").enterPrice("150").enterMRP("200").enterStockAvailability("500")
	  .enterPurchasePrice("175").enterDescription("product description").chooseFile().comboPackYes().clickSave().clickSaveMethod();
	  
  }
}
