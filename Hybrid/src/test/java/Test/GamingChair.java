package Test;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.GamingChairPO;
import resource.Browser;

public class GamingChair extends Browser {
	@Test
	public void gamingChair() throws IOException, InterruptedException {
		driver = initializebrowser();
		driver.get(prop.getProperty("url"));
		Actions action = new Actions(driver);
		GamingChairPO a = new GamingChairPO(driver);
		a.searchbar().sendKeys("Gaming Chair");
		a.searchbutton().click();
		WebElement price = a.price();
		action.moveToElement(price).perform();
		a.limit().click();
		Thread.sleep(2000);
		WebElement product = a.count();
		System.out.println("Number of products:"+product.getText());
		List<WebElement> name = a.name();
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
		}
		driver.quit();
		}

}


