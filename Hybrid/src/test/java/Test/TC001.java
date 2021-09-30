package Test;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.TC001_PO;
import resource.Browser;
import resource.data;

public class TC001 extends Browser {
	public static Logger Log = LogManager.getLogger(TC001.class.getName());

		@Test(dataProvider="getdata")
		public void login(String Username ,String Password) throws IOException, InterruptedException  {
			driver = initializebrowser();
			driver.get(prop.getProperty("url"));
			Actions action = new Actions(driver);
			TC001_PO a = new TC001_PO(driver);
			Log.info("TC001 is running");
			WebElement login = a.icon();
			action.moveToElement(login).perform();
			a.popup().click();
			Thread.sleep(10000);
			a.email().sendKeys(Username);
			Log.info("Username is entered");
			a.password().sendKeys(Password);
			Log.info("password is entered");
			a.login().click();
			String actualurl = prop.getProperty("url");
			String expectedurl = driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
			{
				Log.info("valid login");
			}
			else
			{
				Log.info("invalid login");
			}
			driver.quit();
		}
			
			
		@DataProvider
		public Object[][] getdata() throws IOException {
				
			Object[][] data = new Object[2][2] ;
			data d = new data();
			ArrayList<String> test1 = d.getData("Data1");
				
			data[0][0] = test1.get(1);
			data[0][1] = test1.get(2);
				
			ArrayList<String> test2 = d.getData("Data2");
			data[1][0] = test2.get(1);
			data[1][1] = test2.get(2);
			
			return data;
			
			
			


}
}
