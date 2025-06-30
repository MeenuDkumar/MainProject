package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base{
	HomePage home;
	ManageFooterText foot;
  @Test
  public void validatefootertext () throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "ManageFooterText");
	  String password=ExcelUtility.readStringData(1, 1, "ManageFooterText");
	  String address=ExcelUtility.readStringData(1, 2, "ManageFooterText");
	  String email=ExcelUtility.readStringData(1, 3, "ManageFooterText");
	  String phone=ExcelUtility.readintegerdata(1, 4, "ManageFooterText");
	  login.enterusernameandpassword(username, password);
	  home= login.signin();
	  foot=home.clickmoreinfo4();
	  foot.clickaction().enteraddressfooter(address).enteremailfooter(email).enterphonefooter(phone).clickupdatefooter();
	//  String title=driver.getTitle();  
	//  System.out.println(title);
	 String expectedtitle="Footer Text | 7rmart supermarket";
	  String actualtitle=driver.getTitle();
	 Assert.assertEquals(expectedtitle,actualtitle,"not equal");
	  
  }
}
