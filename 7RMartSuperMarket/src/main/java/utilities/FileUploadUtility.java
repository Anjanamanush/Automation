package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {

	public void sendKeysForFileUpload(WebElement element,String path)
	{
		element.sendKeys(path);
	}
	public void robotClassForFileUpload(WebElement element,String path) throws AWTException
	{
		//copy pdf path
				StringSelection stringselection=new StringSelection(path);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
				//ToolKit class and getDefaultToolkit(),getSystemClipboard()- is used to copy to clipboard.
				//setContents()- pass arguments
				Robot robo=new Robot();
				robo.delay(1000);
				robo.keyPress(KeyEvent.VK_CONTROL);//vk-virtualkeys, KeyEvent- class.keyPress()-method
				robo.keyPress(KeyEvent.VK_V);
				robo.keyRelease(KeyEvent.VK_CONTROL);
				robo.keyRelease(KeyEvent.VK_V);
				robo.keyPress(KeyEvent.VK_ENTER);
				robo.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
