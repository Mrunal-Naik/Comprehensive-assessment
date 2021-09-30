package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.TC009_PO;
import resource.Browser;

public class TC009 extends Browser {
	public static Logger Log = LogManager.getLogger(TC009.class.getName());
	@Test
	public void navigate() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
	    Actions action = new Actions(driver);
	    TC009_PO po = new TC009_PO(driver);
	    Log.info("TC009 is running");
	    po.allfurniture().click();
	    Thread.sleep(1000);
	    po.Decor().click();
	    Log.info("Navigated to page1");
	    Set<String> a = driver.getWindowHandles();
		Iterator<String> it1 = a.iterator();
		driver.switchTo().window(it1.next());
		driver.switchTo().window(it1.next());
	    po.Lighting().click();
	    Log.info("Navigated to page2");
	    Set<String> ab = driver.getWindowHandles();
		Iterator<String> it2 = ab.iterator();
		driver.switchTo().window(it2.next());
		driver.switchTo().window(it2.next());
		driver.switchTo().window(it2.next());
		Thread.sleep(1000);
	    po.CeilingLights().click();
	    Log.info("Navigated to page3");
	    Set<String> abc = driver.getWindowHandles();
		Iterator<String> it3 = abc.iterator();
		driver.switchTo().window(it3.next());
		driver.switchTo().window(it3.next());
		driver.switchTo().window(it3.next());
		driver.switchTo().window(it3.next());
		Log.info("Navigated to page4");
		Thread.sleep(1000);
	    WebElement hover = po.price();
	    action.moveToElement(hover).perform();
	    po.limit().click();
	    Thread.sleep(1000);
	    WebElement count = po.number();
	    Log.info(count.getText());
	    driver.quit();
	    
	    
}
}
