package TestCases;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.TC003_PO;
import resource.Browser;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
public class TC003 extends Browser{
	public static Logger Log = LogManager.getLogger(TC003.class.getName());
	Actions action = new Actions(driver);
	TC003_PO a = new TC003_PO(driver);
	@When("^user navigate to the glassware$")
    public void user_navigate_to_the_glassware() throws Throwable {
		WebElement dining = a.dining();
		action.moveToElement(dining).perform();
		Thread.sleep(2000);
		a.glassware().click();
		a.product1().click();
		Log.info("product1 is selected");
    }
    @And("^add in the cart$")
    public void add_in_the_cart() throws Throwable {
    	Thread.sleep(1000);
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		driver.switchTo().window(it.next());
		driver.switchTo().window(it.next());
		a.addToCart().click();
		Log.info("product1 is added in cart");
		a.continueShopping().click();
		Thread.sleep(1000);
		a.product2().click();
		Log.info("product2 is selected");
		Set<String> abcd = driver.getWindowHandles();
		Iterator<String> it1 = abcd.iterator();
		driver.switchTo().window(it1.next());
		driver.switchTo().window(it1.next());
		driver.switchTo().window(it1.next());
		a.add().click();
		Log.info("product2 is added in cart");
    }
    @Then("^product is displayed in the cart$")
    public void product_is_displayed_in_the_cart() throws Throwable {
    	Log.info("Product is verified");
       
    }


   

    

}