package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterText {
	WebDriver driver;
	public ManageFooterText(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement action;
	@FindBy(xpath="//textarea[@id='content']")WebElement address;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement update;
	
	public ManageFooterText clickaction()
	{
		action.click();
		return this;
	}
	public ManageFooterText enteraddressfooter(String add)
	{
	address.sendKeys(add);
	return this;
	}
	public ManageFooterText enteremailfooter(String mail)
	{
		email.sendKeys(mail);
		return this;
	}
	public ManageFooterText enterphonefooter(String num)
	{
		phone.sendKeys(num);
		return this;
	}
	public ManageFooterText clickupdatefooter()
	{
		update.click();
		return this;
	}

}
