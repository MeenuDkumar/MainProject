package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.FakerUtility;
import utilities.PageUtility;

public class AdminUser {
	
    PageUtility page=new PageUtility();
	public WebDriver driver;
	public AdminUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
    @FindBy(xpath="//input[@name='username']")WebElement username;
    @FindBy(xpath="//input[@name='password']")WebElement password;
    @FindBy(xpath="(//select[@class='form-control'])[2]")WebElement usertype;
    @FindBy(xpath="//i[@class='fa fa-save']")WebElement save;



public AdminUser clicknewbutton()
{
	newbutton.click();
	return this;
}
public AdminUser enterusernameandpassword(String adminusername1,String adminpassword1)
{
	//page.sendkeys(username,"meenu");
	//page.sendkeys(password,"12453");
	username.sendKeys(adminusername1);
	password.sendKeys(adminpassword1);
	return this;
}
public AdminUser selectusertype1(int drop) {
	Select select1=new Select( usertype);
	select1.selectByIndex(drop);
	usertype.click();
	return this;
}
public AdminUser clicksavebutton()
{
	save.click();
	return this;
}

}
