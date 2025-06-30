package mainpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContact {
	WebDriver driver;
	public ManageContact(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@role='button']")WebElement edit;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//textarea[@placeholder='Enter the Address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement delivery;
	@FindBy(xpath="//input[@id='del_limit']")WebElement charge;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement update;
	@FindBy(xpath="//div[@id='adddiv']")WebElement alert;
	
	public ManageContact clickonedit()
	{
		edit.click();
		return this;
	}
	public ManageContact enterphone(String phonenum)
	{
		phone.sendKeys(phonenum);
		return this;
	}
	public ManageContact entermail(String emailid)
	{
		email.sendKeys(emailid);
		return this;
	}
	public ManageContact enteraddress(String add)
	{
		address.sendKeys(add);
		return this;
		}
	public ManageContact scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)", "");
        return this;
	}
	public ManageContact enterdelivertime(String time)
	{
		delivery.sendKeys(time);
		return this;
	}
	public ManageContact enterdeliverycharge(String delivery)
	{
		charge.sendKeys(delivery);
		return this;
	}
	public ManageContact enterupdate()
	{  
		JavascriptExecutor script=(JavascriptExecutor) driver;
		script.executeScript("arguments[0].click();",update );
		update.click();
		return this;
	}
	public boolean iscontactupdatedisDisplayed()
	{
		return alert.isDisplayed();

}
}
