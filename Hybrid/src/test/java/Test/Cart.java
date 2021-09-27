package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.CartPO;
import resource.Browser;

public class Cart extends Browser{
	public static Logger Log = LogManager.getLogger(Cart.class.getName());
	@Test
	public void addtocart() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		CartPO a = new CartPO(driver);
		Log.info("TC003 is running");
		WebElement dining = a.dining();
		action.moveToElement(dining).perform();
		Thread.sleep(2000);
		a.glassware().click();
		a.product1().click();
		Log.info("product1 is selected");
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		a.addToCart().click();
		Log.info("product1 is added in cart");
		a.continueShopping().click();
		Thread.sleep(1000);
		a.product2().click();
		Log.info("product2 is selected");
		Set<String> abcd = driver.getWindowHandles();
		Iterator<String> it1 = abcd.iterator();
		driver.switchTo().window(it1.next());
		driver.switchTo().window(it1.next());
		driver.switchTo().window(it1.next());
		a.add().click();
		Log.info("product2 is added in cart");
		driver.quit();
		

}
}
