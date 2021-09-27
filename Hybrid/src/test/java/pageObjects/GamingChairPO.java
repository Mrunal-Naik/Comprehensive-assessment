package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamingChairPO {
public WebDriver driver;
	
	@FindBy(id="search")
	WebElement searchbar;
	@FindBy(id="search_button")
	WebElement searchbutton;
	@FindBy(css="li[data-group='price']")
	WebElement price;
	@FindBy(css="input[id='price_limit_9722-9999']")
	WebElement limit;
	@FindBy(css="span[class='results-count']")
	WebElement count;
	@FindBy(css="span[itemprop='name']")
	List<WebElement> name;
	
	
	 public GamingChairPO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement searchbar() {
			 return searchbar;
		 }
		
		public WebElement searchbutton(){
			return searchbutton;
		}
		
		public WebElement price(){
			return price;
		}
		
		public WebElement limit(){
			return limit;
		}
		
		public WebElement count(){
			return count;
		}
		
		public List<WebElement> name(){
			return name;
		}
		
}
