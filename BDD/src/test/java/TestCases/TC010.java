package TestCases;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC010_PO;
import resource.Browser;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
public class TC010 extends Browser{
	public static Logger Log = LogManager.getLogger(TC010.class.getName());
	Actions action = new Actions(driver);
    TC010_PO po = new TC010_PO(driver);

    @When("^user is navigate to kidsbookshelf$")
    public void user_is_navigate_to_kidsbookshelf() throws Throwable {
    	WebElement hover =po.kids();
	    action.moveToElement(hover).perform();
	    po.bookshelf().click();
	    Log.info("kids bookshelf is selected");
    }
    
    @And("^click on one product$")
    public void click_on_one_product() throws Throwable {
    	WebElement sorting = po.sorting();
 	    action.moveToElement(sorting).perform();
 	    po.newarrival().click();
 	    Log.info("new arrival is selected");
 	    Thread.sleep(1000);
 	    po.product().click();
 	    Log.info("product is selected");
    }

    @Then("^grab the name and price of product$")
    public void grab_the_name_and_price_of_product() throws Throwable {
    	Set<String> abc = driver.getWindowHandles();
 		Iterator<String> it = abc.iterator();
 		driver.switchTo().window(it.next());
 		driver.switchTo().window(it.next());
 		WebElement name = po.name();
 		Log.info(name.getText());
 		WebElement price = po.price();
 		Log.info(price.getAttribute("content"));
    }

   

}
