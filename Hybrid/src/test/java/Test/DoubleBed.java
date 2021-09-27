package Test;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.DoubleBedPO;
import resource.Browser;

public class DoubleBed extends Browser {
	public static Logger Log = LogManager.getLogger(DoubleBed.class.getName());
	@Test
	public void doublebed() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		DoubleBedPO a = new DoubleBedPO(driver);
		Log.info("TC003 is running");
		WebElement bedroom = a.bedroomunit();
		action.moveToElement(bedroom).perform();
		a.DoubleBed().click();
		WebElement feature = a.feature();
		action.moveToElement(feature).perform();
		a.type().click();
		Thread.sleep(2000);
		Log.info("feature is selected");
		WebElement material = a.material();
		action.moveToElement(material).perform();
		a.wood().click();
		Thread.sleep(2000);
		Log.info("material is selected");
		WebElement finish = a.finish();
		action.moveToElement(finish).perform();
		a.walnut().click();
		Thread.sleep(2000);
		Log.info("finish is selected");
		WebElement size = a.size();
		action.moveToElement(size).perform();
		a.king().click();
		Thread.sleep(2000);
		Log.info("size is selected");
		WebElement product = a.count();
		Log.info("Number of products:"+product.getText());
		List<WebElement> name = a.name();
		for(int i=0;i<name.size();i++) {
			Log.info(name.get(i).getText());
		}
		driver.quit();

		
		
}

}


