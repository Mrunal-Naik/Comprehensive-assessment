package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.WoodenSofaPO;
import resource.Browser;

public class WoodenSofa extends Browser {
	public static Logger Log = LogManager.getLogger(WoodenSofa.class.getName());

	@Test
	public void woodenSofa() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		WoodenSofaPO a = new WoodenSofaPO(driver);
		Log.info("TC008 is running");
		WebElement sale = a.sale();
		action.moveToElement(sale).perform();
		a.woodensofa().click();
		Log.info("wooden sofa is selected");
		WebElement recommended = a.sorting();
		action.moveToElement(recommended).perform();
		a.lowtohigh().click();
		Log.info("price sorted from low to high");
		WebElement product = a.count();
		Log.info("Number of products:"+product.getText());
		a.product().click();
		Log.info("product is selected");
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		WebElement title = a.name();
		Log.info(title.getText());
		WebElement price = a.price();
		Log.info("Price:"+price.getText());
		driver.quit();
		
}

}


