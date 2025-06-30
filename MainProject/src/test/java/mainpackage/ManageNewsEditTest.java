package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class ManageNewsEditTest extends Base {
	HomePage home;
	ManageNewsEdit news;
	
  @Test
  public void validatemanagenewsedit() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "ManageNewsEditTest");
	  String password=ExcelUtility.readStringData(1, 1, "ManageNewsEditTest");
	  String enternews=ExcelUtility.readStringData(1, 2, "ManageNewsEditTest");//1st row
	  
	  login.enterusernameandpassword(username, password);
	  home=login.signin();
	  news=home.clickmoreinfo6();
	  news.clicknewedit().enterthenews(enternews).clickupdate();
	  //String title=driver.getTitle();  
	  //System.out.println(title);    
	  String expectedtitle="Add News | 7rmart supermarket"; //title from console
	  String actualtitle=driver.getTitle();
	 Assert.assertEquals(expectedtitle,actualtitle,"not equal");
  }
}
