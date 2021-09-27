package Test;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.BookShelfPO;
import resource.Browser;

public class TC004 extends Browser {
	public static Logger Log = LogManager.getLogger(TC004.class.getName());
	@Test
	public void bookshelf() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		BookShelfPO a = new BookShelfPO(driver);
		Log.info("TC004 is running");
		a.searchbar().sendKeys("bookshelf");
		a.searchbutton().click();
		Log.info("Clicked on searchbutton");
		WebElement recommended = a.sorting();
		action.moveToElement(recommended).perform();
		a.hightolow().click();
		Log.info("Sorted from high to low");
		Thread.sleep(1000);
		a.product1().click();
		Log.info("product1 is selected");
		WebElement compare = a.hover();
		action.moveToElement(compare).perform();
		Thread.sleep(1000);
		a.product2().click();
		Log.info("Product2 is selected");
		Thread.sleep(1000);
		a.compare().click();
		Log.info("Clicked on compare");
		Thread.sleep(2000);
		List<WebElement> capacity = a.name();
		for(int i=0;i<capacity.size();i++) {
			Log.info(capacity.get(i).getText());
		}
		driver.quit();
		
		
		}

}


