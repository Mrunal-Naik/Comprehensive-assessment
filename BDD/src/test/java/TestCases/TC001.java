package TestCases;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC001_PO;
import resource.Browser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class TC001 extends Browser{
	public static Logger Log = LogManager.getLogger(TC001.class.getName());
	@Given("^User opens the Browser$")
    public void user_opens_the_browser() throws Throwable {
    	driver =initializebrowser();
        
    }
    
    @And("^Navigated to \"([^\"]*)\"$")
    public void navigated_to_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
        
    }
    
    @And("^Click on Login Button$")
    public void click_on_login_button() throws Throwable {
    	Actions action = new Actions(driver);
		TC001_PO a = new TC001_PO(driver);
		Log.info("TC001 is running");
		WebElement login = a.icon();
		action.moveToElement(login).perform();
		a.popup().click();
    }

    @When("^User login into account using valid and invalid (.+) and (.+)$")
    public void user_login_into_account_using_valid_and_invalid_and(String username, String password) throws Throwable {
    	Thread.sleep(10000);
    	TC001_PO a = new TC001_PO(driver);
		a.email().sendKeys(username);
		Log.info("Username is entered");
		a.password().sendKeys(password);
		Log.info("password is entered");
		a.login().click();
    }

    @Then("^Check if the user is logged in the account$")
    public void check_if_the_user_is_logged_in_the_account() throws Throwable {
    	String actualurl = "https://www.urbanladder.com/";
		String expectedurl = driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
		{
			Log.info("valid login");
		}
		else
		{
			Log.info("invalid login");
		}
    }

    @And("^Close the Browser$")
    public void close_the_Browser() throws Throwable {
    	driver.quit();
    }

}
