package TestCases;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC008_PO;
import resource.Browser;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class TC008 extends Browser{
	public static Logger Log = LogManager.getLogger(TC008.class.getName());
	Actions action = new Actions(driver);
	TC008_PO a = new TC008_PO(driver);

    @When("^user is navigate to the woodensofa$")
    public void user_is_navigate_to_the_product() throws Throwable {
    	WebElement sale = a.sale();
    	action.moveToElement(sale).perform();
		a.woodensofa().click();
		Log.info("wooden sofa is selected");
    }
    
    @And("^filter to Low to high$")
    public void filter_to_low_to_high() throws Throwable {
    	WebElement recommended = a.sorting();
		action.moveToElement(recommended).perform();
		a.lowtohigh().click();
		Log.info("price sorted from low to high");
		WebElement product = a.count();
		Log.info("Number of products:"+product.getText());
		a.product().click();
		Log.info("product is selected");
    }

    @Then("^grab the name and price of the sofa$")
    public void grab_the_name_and_price_of_the_sofa() throws Throwable {
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		WebElement title = a.name();
		Log.info(title.getText());
		WebElement price = a.price();
		Log.info("Price:"+price.getText());
    }

 }
