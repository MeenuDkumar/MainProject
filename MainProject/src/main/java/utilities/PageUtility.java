package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByIndex(WebElement element,int a)  //for dropdown
	{
		Select select1=new Select(element);
	   select1.selectByIndex(a);
	   
	 }
	public void sendkeys(WebElement element,String text) //for sendkeys
	{
		element.sendKeys(text);
	}

}
