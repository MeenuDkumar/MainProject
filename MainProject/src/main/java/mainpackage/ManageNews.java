package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNews {
	WebDriver driver;
	ManageNews(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement enternews;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;
	
	
	public ManageNews clicknewnews()
	{
	newbutton.click();
	return this;
	}
	public ManageNews enterthenews(String news)
	{
	enternews.sendKeys(news);	
	return this;
	}
	public ManageNews clicksave()
	{
		save.click();
		return this;
	}
	
	

}
