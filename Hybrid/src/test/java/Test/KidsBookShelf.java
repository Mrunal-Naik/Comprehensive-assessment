package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.KidBookShelfPO;
import resource.Browser;

public class KidsBookShelf extends Browser{
	public static Logger Log = LogManager.getLogger(KidsBookShelf.class.getName());
	@Test
	public void kidsbookShelf() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
	    Actions action = new Actions(driver);
	    KidBookShelfPO po = new KidBookShelfPO(driver);
	    Log.info("TC010 is running");
	    WebElement hover =po.kids();
	    action.moveToElement(hover).perform();
	    po.bookshelf().click();
	    Log.info("kids bookshelf is selected");
	    WebElement sorting = po.sorting();
	    action.moveToElement(sorting).perform();
	    po.newarrival().click();
	    Log.info("new arrival is selected");
	    Thread.sleep(1000);
	    po.product().click();
	    Log.info("product is selected");
	    Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		WebElement name = po.name();
		Log.info(name.getText());
		WebElement price = po.price();
		Log.info(price.getAttribute("content"));
		driver.quit();

}
}