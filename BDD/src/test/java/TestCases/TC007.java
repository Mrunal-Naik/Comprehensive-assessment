package TestCases;



import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import cucumber.api.junit.Cucumber;
import pageObjects.TC007_PO;
import resource.Browser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


@RunWith(Cucumber.class)
public class TC007 extends Browser{
	public static Logger Log = LogManager.getLogger(TC007.class.getName());
	TC007_PO a = new TC007_PO(driver);

    @When("^user navigate to the stores and select mumbai$")
    public void user_navigate_to_the_stores_and_select_mumbai() throws Throwable {
    	a.Stores().click();
		a.mumbai().click();
    }

    @Then("^correct address and email ID is displayed$")
    public void correct_address_and_email_id_is_displayed() throws Throwable {
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
    }

  

}
