package mainpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsEdit {
	WebDriver driver;
	ManageNewsEdit(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=6466&page_ad=1']")WebElement editbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement enternews;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement update;
	public ManageNewsEdit clicknewedit()
	{
	editbutton.click();
	return this;
	}
	public ManageNewsEdit enterthenews(String news)
	{
	enternews.sendKeys(news);	
	return this;
	}
	public ManageNewsEdit clickupdate()
	{
		update.click();
		return this;
	}

}
