package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import utilities.ExcelUtility;

public class HomeTestClass extends Base{
	HomePage home;
  @Test
  public void homepageverification() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0,"HomePageTest");
	  String password=ExcelUtility.readStringData(1, 1,"HomePageTest");
	  login.enterusernameandpassword(username, password);
	 home= login.signin();
	 home.clickadminbutton().clicklogoutbutton();
	 String expected= "Login |7mart supermarket";
	 String actual=driver.getTitle();
	 Assert.assertEquals(expected, actual,Constants.ERRORMESSAGE1);
	 /* HomePage home=new HomePage(driver);
	  home.clickadminbutton();
	  home.clicklogoutbutton();*/
	 
	  
  }
}
