package TestCases;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC006_PO;
import resource.Browser;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class TC006 extends Browser {
	public static Logger Log = LogManager.getLogger(TC006.class.getName());
	TC006_PO a = new TC006_PO(driver);
	Actions action = new Actions(driver);
  
    @When("^user navigate to the gaming chairs$")
    public void user_navigate_to_the_gaming_chairs() throws Throwable {
    	TC006_PO a = new TC006_PO(driver);
		a.searchbar().sendKeys("Gaming Chair");
		Log.info("Gaming Chair is searched");
		a.searchbutton().click();
    }
    
    @And("^check the highest price range$")
    public void check_the_highest_price_range() throws Throwable {
    	WebElement price = a.price();
		action.moveToElement(price).perform();
		a.limit().click();
		Log.info("Price limit is selected");
		Thread.sleep(2000);
    }

    @Then("^product with that price range is displayed$")
    public void product_with_that_price_range_is_displayed() throws Throwable {
    	WebElement product = a.count();
    	Log.info("Number of products:"+product.getText());
		List<WebElement> name = a.name();
		for(int i=0;i<name.size();i++) {
			Log.info(name.get(i).getText());
		}
		driver.quit();
		}
}

   

   


