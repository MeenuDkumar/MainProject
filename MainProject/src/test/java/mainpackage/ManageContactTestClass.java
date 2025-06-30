package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import utilities.ExcelUtility;

public class ManageContactTestClass extends Base{
	HomePage home;
	ManageContact manage;
  @Test
  public void validatemanagecategory() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "ManageContactTest");
	  String password=ExcelUtility.readStringData(1, 1, "ManageContactTest");
	  String phone=ExcelUtility.readintegerdata(1, 2, "ManageContactTest");
	  String email=ExcelUtility.readStringData(1, 3, "ManageContactTest");
	  String address=ExcelUtility.readStringData(1, 4, "ManageContactTest");
	  String time=ExcelUtility.readStringData(1, 5, "ManageContactTest");
	  String charge=ExcelUtility.readintegerdata(1, 6, "ManageContactTest");
	  
	  login.enterusernameandpassword(username, password);
	  home= login.signin();
	  manage=home.clickmoreinfor3();
	  manage.clickonedit().enterphone(phone).entermail(email).enteraddress(address)
	  .scrolldown().enterdelivertime(time).enterdeliverycharge(charge).enterupdate();
	  boolean AlertmessageDisplayed=manage.iscontactupdatedisDisplayed();
	  Assert.assertTrue(AlertmessageDisplayed, Constants.ERRORMESSSAGE);//handling assertion using constant method .go to constants and check
	  
  }
}
