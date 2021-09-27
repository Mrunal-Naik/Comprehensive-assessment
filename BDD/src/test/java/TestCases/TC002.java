package TestCases;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC002_PO;
import resource.Browser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
public class TC002 extends Browser{
	public static Logger Log = LogManager.getLogger(TC002.class.getName());
	Actions action = new Actions(driver);
	TC002_PO a = new TC002_PO(driver);
    @And("^Login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_valid_something_and_something(String strArg1, String strArg2) throws Throwable {
    	WebElement login = a.icon();
		action.moveToElement(login).perform();
	    a.popup().click();
		Thread.sleep(10000);
		a.email().sendKeys("datatesting288@gmail.com");
		Log.info("enter username");
		a.password().sendKeys("Testing@288");
		Log.info("enter password");
		a.login().click();
		Log.info("clicked on login");
    }

    @When("^user navigate to the product$")
    public void user_navigate_to_the_product() throws Throwable {
    	WebElement study = a.studyunit();
		action.moveToElement(study).perform();
		Thread.sleep(1000);
		Log.info("selected a product");
		a.computertable().click();
    }
    
    @And("^add to wishlist$")
    public void add_to_wishlist() throws Throwable {
    	WebElement wishlist = a.wishlist();
		action.moveToElement(wishlist).perform();
		a.click().click();
		Log.info("Added to wishlist");
		a.shortlist().click();
    }

    @Then("^product is displayed in wishlist$")
    public void product_is_displayed_in_wishlist() throws Throwable {
    	WebElement name = a.name();
		Log.info(name.getText());
    }

    @Then("^See the product is removed$")
    public void see_the_product_is_removed() throws Throwable {
    	WebElement removewishlist = a.hover();
		action.moveToElement(removewishlist).perform();
		a.removewishlist().click();
		Log.info("Removed from wishlist");
	    a.shortlist().click();
    }

    @And("^check if we can remove the product again$")
    public void check_if_we_can_remove_the_product_again() throws Throwable {
    	a.shortlist().click();
    }


}
