package mainpackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import utilities.FileUploadUtilities;

public class ManageCategoryPage {
	WebDriver driver;
	FileUploadUtilities file=new FileUploadUtilities ();
	public ManageCategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newbutton;
	@FindBy(xpath="//input[@id='category']")WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement discount;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//input[@name='top_menu' and @value='no']")WebElement topmenu;
	@FindBy(xpath="//input[@value='no' and @name='show_home']")WebElement leftmenu;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement save;



public ManageCategoryPage clicknewbutton()
{
	newbutton.click();
	return this;
}
public ManageCategoryPage selectcategory(String categoryname)
{
	category.sendKeys(categoryname);
	return this;
}
public ManageCategoryPage clickondiscount()
{
	discount.click();
	return this;

}
public ManageCategoryPage clickchoosefile(String path)
{
	file.sendkeysforfileupload(choosefile,Constants.paths);
	return this;
}
public ManageCategoryPage clicktopmenu()
{
	JavascriptExecutor script=(JavascriptExecutor)driver;	
	script.executeScript("arguments[0].click();", topmenu);
	topmenu.click();
	return this;
}
public ManageCategoryPage clickleftmenu()
{
	JavascriptExecutor script=(JavascriptExecutor)driver;	
	script.executeScript("arguments[0].click();", leftmenu);
	leftmenu.click();
	return this;
}
public ManageCategoryPage clicksave()
{
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", save);
    return this;
	}

}

