package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[text()='Sign In']")WebElement login;
	@FindBy(xpath="//p{text()='Dashboard'")WebElement dash;


public LoginPage enterusernameandpassword(String usernamefield,String passwordfield)
{
username.sendKeys(usernamefield);	
password.sendKeys(passwordfield);
return this;  //current class 
}
public HomePage signin()
{
	login.click(); 
	return new HomePage(driver); //moving to home page so we write like this
}
public boolean isDashboardisDisplayed()
{
	return dash.isDisplayed();  //to check display or not 
}
}