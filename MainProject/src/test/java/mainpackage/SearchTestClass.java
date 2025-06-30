package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class SearchTestClass extends Base {
	HomePage home;
	SearchPage search;
  @Test
  public void searchverification() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "SearchTestClass");
	  String password=ExcelUtility.readStringData(1, 1, "SearchTestClass");
	  String adminusername=ExcelUtility.readStringData(1, 2, "SearchTestClass");
	  login.enterusernameandpassword(username, password);
	home=  login.signin();
	search=home.clickmoreinfo1();
	search.clickonsearchbuttonupper().searchingforusername(adminusername).searchusertype(2).clicksearchbuttonlower();
	//String title=driver.getTitle();  
	 // System.out.println(title);  
	 String expectedtitle="Admin Users | 7rmart supermarkets"; //title from console
	  String actualtitle=driver.getTitle();
	 Assert.assertEquals(expectedtitle,actualtitle,"not equal");
	
	
	
	  /*AdminUser admin=new AdminUser(driver);
	  admin.clickmoreinfo();
	  SearchPage searching=new SearchPage(driver);
	  searching.clickonsearchbuttonupper();
	  searching.searchingforusername("meenu");
	  searching.searchusertype(1);
	  searching.clicksearchbuttonlower();*/
  }
}
