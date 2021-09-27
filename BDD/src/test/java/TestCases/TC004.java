package TestCases;


import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC004_PO;
import resource.Browser;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class TC004 extends Browser{
	public static Logger Log = LogManager.getLogger(TC004.class.getName());
	Actions action = new Actions(driver);
	TC004_PO a = new TC004_PO(driver);
    @When("^user is navigate to the bookshelf$")
    public void user_is_navigate_to_the_product() throws Throwable {
    	a.searchbar().sendKeys("bookshelf");
		a.searchbutton().click();
		Log.info("Clicked on searchbutton");
		WebElement recommended = a.sorting();
		action.moveToElement(recommended).perform();
		a.hightolow().click();
		Log.info("Sorted from high to low");
		Thread.sleep(1000);
    }
    
    @And("^compare the product$")
    public void compare_the_product() throws Throwable {
    	a.product1().click();
		Log.info("product1 is selected");
		WebElement compare = a.hover();
		action.moveToElement(compare).perform();
		Thread.sleep(1000);
		a.product2().click();
		Log.info("Product2 is selected");
		Thread.sleep(1000);
		a.compare().click();
		Log.info("Clicked on compare");
		Thread.sleep(2000);
    }

    @Then("^product is compared$")
    public void product_is_compared() throws Throwable {
    	List<WebElement> capacity = a.name();
		for(int i=0;i<capacity.size();i++) {
			Log.info(capacity.get(i).getText());
		}
		driver.quit();
		
		
		}

   

    

}
