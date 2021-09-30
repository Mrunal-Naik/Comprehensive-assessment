package Test;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.TC006_PO;
import resource.Browser;

public class TC006 extends Browser {
	public static Logger Log = LogManager.getLogger(TC006.class.getName());
	@Test
	public void gamingChair() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		TC006_PO a = new TC006_PO(driver);
		Log.info("TC006 is running");
		a.searchbar().sendKeys("Gaming Chair");
		Log.info("Gaming Chair is searched");
		a.searchbutton().click();
		WebElement price = a.price();
		action.moveToElement(price).perform();
		a.limit().click();
		Log.info("Price limit is selected");
		Thread.sleep(2000);
		WebElement product = a.count();
		Log.info("Number of products:"+product.getText());
		List<WebElement> name = a.name();
		for(int i=0;i<name.size();i++) {
			Log.info(name.get(i).getText());
		}
		driver.quit();
		}

}


