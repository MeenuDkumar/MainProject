package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	HomePage home;
	AdminUser admin;
	FakerUtility faker=new FakerUtility();
  @Test
  public void Adminuserverification() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "AdminUserTest");
	  String password=ExcelUtility.readStringData(1, 1, "AdminUserTest");
	// String adminusername=ExcelUtility.readStringData(1, 2, "AdminUserTest");
	// String adminpassword=ExcelUtility.readStringData(1, 3, "AdminUserTest");
	  login.enterusernameandpassword(username, password);
	  home=login.signin();
	  admin=home.clickmoreinfo();
	  String adminusername1=faker.getFakeFirstName();
	 String adminpassword1=faker.getPassword();
	 admin.clicknewbutton().enterusernameandpassword(adminusername1,adminpassword1).selectusertype1(2).clicksavebutton();
	// String title=driver.getTitle();  
	// System.out.println(title);
	 String expectedtitle="Admin User | 7rmart supermarket";
	  String actualtitle=driver.getTitle();
	Assert.assertEquals(expectedtitle,actualtitle,"not equal");
	
	 
	 
	  
	  
	  
	  
	 /* AdminUser admin=new AdminUser(driver);
	  admin.clickmoreinfo();
	  admin.clicknewbutton();
	  admin.enterusernameandpassword("rom", "478nbg");
	  admin.selectusertype(2);
	  admin.clicksavebutton();*/
	  
  }
}
