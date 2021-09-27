package Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.WishListPO;
import resource.Browser;

public class WishList extends Browser{
	public static Logger Log = LogManager.getLogger(WishList.class.getName());
	@Test
	public void wishlist() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		WishListPO a = new WishListPO(driver);
		Log.info("TC002 is running");
		WebElement login = a.icon();
		action.moveToElement(login).perform();
	    a.popup().click();
		Thread.sleep(10000);
		a.email().sendKeys("datatesting288@gmail.com");
		Log.info("enter username");
		a.password().sendKeys("Testing@288");
		Log.info("enter password");
		a.login().click();
		Log.info("clicked on login");
		WebElement study = a.studyunit();
		action.moveToElement(study).perform();
		Thread.sleep(1000);
		Log.info("selected a product");
		a.computertable().click();
		WebElement wishlist = a.wishlist();
		action.moveToElement(wishlist).perform();
		a.click().click();
		Log.info("Added to wishlist");
		a.shortlist().click();
		WebElement name = a.name();
		Log.info(name.getText());
		WebElement removewishlist = a.hover();
		action.moveToElement(removewishlist).perform();
		a.removewishlist().click();
		Log.info("Removed from wishlist");
	    a.shortlist().click();
		driver.quit();

}
}
