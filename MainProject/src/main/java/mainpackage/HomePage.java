package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
WebDriver driver;
WaitUtility wait=new WaitUtility();
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement adminbutton;
@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
@FindBy(xpath="(//a[@class='small-box-footer'])[1]")WebElement moreinfo;
@FindBy(xpath="(//a[@class='small-box-footer'])[1]")WebElement moreinfo1;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement moreinfor2;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact']")WebElement moreinfo3;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")WebElement moreinfo4;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement moreinfo5;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement moreinfo6;
//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")WebElement moreinfo7;
public HomePage clickadminbutton()
{
adminbutton.click();
return this;
}
public HomePage clicklogoutbutton()
{
	wait.waitforelementclick(driver, logout); //for wait
	logout.click();
	return this;  //here no action is performing in loginpage so can give return this(but it will move to testpage)
}
public AdminUser clickmoreinfo() 
{
	moreinfo.click();
	return new AdminUser(driver);
}
public SearchPage clickmoreinfo1() 
{
	moreinfo1.click();
	return new SearchPage(driver);
}
public ManageCategoryPage clickmoreinfo2()
{
moreinfor2.click();	
return new ManageCategoryPage(driver);
}
public ManageContact clickmoreinfor3()
{
	moreinfo3.click();
	return new ManageContact(driver);
}
public ManageFooterText clickmoreinfo4()
{
	moreinfo4.click();
	return new ManageFooterText(driver);
}
public ManageNews clickmoreinfo5()
{
	moreinfo5.click();
	return new ManageNews(driver);
}
public ManageNewsEdit clickmoreinfo6()
{
	moreinfo6.click();
	return new ManageNewsEdit(driver);
}

}

