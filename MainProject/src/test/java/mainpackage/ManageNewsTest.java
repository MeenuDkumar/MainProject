package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	HomePage home;
	ManageNews manage;
  @Test
  public void validatemanagenews() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "ManageNewsTest");
	  String password=ExcelUtility.readStringData(1, 1, "ManageNewsTest");
	  String enternews=ExcelUtility.readStringData(1, 2, "ManageNewsTest");//1st row
	  
	  login.enterusernameandpassword(username, password);
	  home=login.signin();
	  manage=home.clickmoreinfo5();
	  manage.clicknewnews().enterthenews(enternews).clicksave();
	  //String title=driver.getTitle();  
	  //System.out.println(title);    
	  String expectedtitle="Add News | 7rmart supermarket"; //title from console
	  String actualtitle=driver.getTitle();
	 Assert.assertEquals(expectedtitle,actualtitle,"not equal");
	  
	  
  }
}
