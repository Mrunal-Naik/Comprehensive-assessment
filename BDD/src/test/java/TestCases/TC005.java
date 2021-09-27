package TestCases;


import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.TC005_PO;
import resource.Browser;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


@RunWith(Cucumber.class)
public class TC005 extends Browser{
	public static Logger Log = LogManager.getLogger(TC005.class.getName());
	TC005_PO a = new TC005_PO(driver);
	Actions action = new Actions(driver);
    @When("^user is navigate to the DoubleBed$")
    public void user_is_navigate_to_the_product() throws Throwable {
    	WebElement bedroom = a.bedroomunit();
		action.moveToElement(bedroom).perform();
		a.DoubleBed().click();
    }
    
    @And("^check the filter$")
    public void check_the_filter() throws Throwable {
    	WebElement feature = a.feature();
		action.moveToElement(feature).perform();
		a.type().click();
		Thread.sleep(2000);
		Log.info("feature is selected");
		WebElement material = a.material();
		action.moveToElement(material).perform();
		a.wood().click();
		Thread.sleep(2000);
		Log.info("material is selected");
		WebElement finish = a.finish();
		action.moveToElement(finish).perform();
		a.walnut().click();
		Thread.sleep(2000);
		Log.info("finish is selected");
		WebElement size = a.size();
		action.moveToElement(size).perform();
		a.king().click();
		Thread.sleep(2000);
		Log.info("size is selected");
    }

    @Then("^only product with that specification is displayed$")
    public void only_product_with_that_specification_is_displayed() throws Throwable {
    	WebElement product = a.count();
		Log.info("Number of products:"+product.getText());
		List<WebElement> name = a.name();
		for(int i=0;i<name.size();i++) {
			Log.info(name.get(i).getText());
		}
		
    }

   
    

    

}