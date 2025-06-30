package mainpackage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constants;

public class LoginTestClass extends Base {
	HomePage home; //globally declared to access throughout
  @Test
  public void validcredentials() {
	  LoginPage login=new LoginPage(driver);
	  login.enterusernameandpassword("admin", "admin");
	  home=login.signin(); //will move homepage when click sighin
	  boolean isHomePageDisplayed=login.isDashboardisDisplayed();
	  Assert.assertTrue(isHomePageDisplayed, Constants.ERRORMESSSAGE);
  }
  @Test(groups ={"smoke"},dataProvider = "mainproject" )
  public void invalidcredentials(String username, String password)
  {
	  LoginPage login =new LoginPage(driver);
	  login.enterusernameandpassword( username,  password);
	 home= login.signin();
	  
	  
  }
  @Test(groups = {"smoke"})
  @Parameters({"username","password"})
  public void invalidusername()
  {
	  LoginPage login =new LoginPage(driver);
	  login.enterusernameandpassword("meenu", "admin");
	 home= login.signin();
  }
  @DataProvider(name = "mainproject")
  public Object[][] testData() {
  	Object data[][] = { { "admin", "admin" } ,{"Meenu","588876"},{"dgydyd","56877"}};
  	return data;
  }
  
}

