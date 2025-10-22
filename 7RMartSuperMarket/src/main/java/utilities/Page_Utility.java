package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_Utility {

	public void selectByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void selectByIndex(WebElement element, int value)
	{
		Select select=new Select(element);
		select.selectByIndex(value);
	}
	public void selectByVisibleText(WebElement element, String value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void dragAndDrop(WebElement element, String value)
	{
		
	}

}
