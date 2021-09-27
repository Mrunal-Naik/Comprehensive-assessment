package TestCases;



import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.TC009_PO;
import resource.Browser;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
public class TC009 extends Browser{
	public static Logger Log = LogManager.getLogger(TC009.class.getName());
	Actions action = new Actions(driver);
    TC009_PO po = new TC009_PO(driver);

    @When("^user navigate to multiple page$")
    public void user_navigate_to_multiple_page() throws Throwable {
    	po.allfurniture().click();
	    Thread.sleep(1000);
	    po.Decor().click();
	    Log.info("Navigated to page1");
	    Set<String> a = driver.getWindowHandles();
		Iterator<String> it1 = a.iterator();
		driver.switchTo().window(it1.next());
		driver.switchTo().window(it1.next());
	    po.Lighting().click();
	    Log.info("Navigated to page2");
	    Set<String> ab = driver.getWindowHandles();
		Iterator<String> it2 = ab.iterator();
		driver.switchTo().window(it2.next());
		driver.switchTo().window(it2.next());
		driver.switchTo().window(it2.next());
		Thread.sleep(1000);
	    po.CeilingLights().click();
	    Log.info("Navigated to page3");
	    Set<String> abc = driver.getWindowHandles();
		Iterator<String> it3 = abc.iterator();
		driver.switchTo().window(it3.next());
		driver.switchTo().window(it3.next());
		driver.switchTo().window(it3.next());
		driver.switchTo().window(it3.next());
		Log.info("Navigated to page4");
    }

    @Then("^note the number of product at the end$")
    public void note_the_number_of_product_at_the_end() throws Throwable {
    	Thread.sleep(1000);
	    WebElement hover = po.price();
	    action.moveToElement(hover).perform();
	    po.limit().click();
	    Thread.sleep(1000);
	    WebElement count = po.number();
	    Log.info(count.getText());
    }

}
