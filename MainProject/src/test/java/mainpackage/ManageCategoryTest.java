package mainpackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.ExcelUtility;

public class ManageCategoryTest extends Base{
	HomePage home;
	ManageCategoryPage category;
  @Test
  public void managecategoryverification() throws IOException {
	  LoginPage login=new LoginPage(driver);
	  String username=ExcelUtility.readStringData(1, 0, "ManageCategoryTest");
	  String password=ExcelUtility.readStringData(1, 1, "ManageCategoryTest");
	  String category1=ExcelUtility.readStringData(1, 2, "ManageCategoryTest");
	  String file=ExcelUtility.readStringData(1, 3, "ManageCategoryTest");
	  
	  login.enterusernameandpassword(username, password);
	 home= login.signin();
	 category=home.clickmoreinfo2();
	 category.clicknewbutton().selectcategory(category1).clickondiscount().clickchoosefile(file).clicktopmenu().clickleftmenu().clicksave();
	 //String title=driver.getTitle();  
	 //System.out.println(title);
	String expectedtitle="Footer Text | 7rmart supermarket";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(expectedtitle,actualtitle,"not equal");
	  
	  
	  
	  
	/*  ManageCategoryPage manage=new ManageCategoryPage(driver);
	  manage.clickmoreinfo();
	  manage.clicknewbutton();
	  manage.selectcategory("sampletest");
	  manage.clickondiscount();
	  manage.clickchoosefile("D:\\Pictures\\Hello World.png");
	  manage.clicktopmenu();
	  manage.clickleftmenu();
	  manage.clicksave();*/
  }
}
