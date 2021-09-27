package Test;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.StorePO;
import resource.Browser;

public class Stores extends Browser {
	public static Logger Log = LogManager.getLogger(Stores.class.getName());
	@Test
	public void stores() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		StorePO a = new StorePO(driver);
		Log.info("TC007 is running");
		a.Stores().click();
		a.mumbai().click();
		WebElement title = a.title();
		Log.info(title.getText());
		WebElement address = a.address();
		String originalAddress = address.getText();
		String expectedAddress = address.getText();
		Assert.assertEquals(originalAddress, expectedAddress);
		Log.info("address is verified");
		WebElement email = a.email();
		String originalemail ="hello@urbanladder.com";
		String expectedEmail = email.getText();
		Assert.assertEquals(originalemail, expectedEmail);
		Log.info("email is verified");
		driver.quit();
		
}

}


