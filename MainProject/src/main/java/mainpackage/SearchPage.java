package mainpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@onclick='click_button(2)']")WebElement search;
	@FindBy(xpath="//input[@id='un']")WebElement userfield;
	@FindBy(xpath="//select[@class='form-control']")WebElement usertype;
	@FindBy(xpath="//select[@id='ut']")WebElement searchbuttonb;
	

public SearchPage clickonsearchbuttonupper()
{
	search.click();
	return this;
}
public SearchPage searchingforusername(String username)
{
	userfield.sendKeys(username);
	return this;
}
public SearchPage searchusertype(int drop)
{
	Select select=new Select(usertype);
	select.selectByIndex(drop);
	usertype.click();
	return this;
}
public SearchPage clicksearchbuttonlower()
{
	JavascriptExecutor script=(JavascriptExecutor) driver;
	script.executeScript("arguments[0].click();",searchbuttonb );
	searchbuttonb.click();
	return this;
}
}
