package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC008_PO {
public WebDriver driver;
	
	@FindBy(css="li[class='topnav_item saleunit']")
	WebElement sale;
	@FindBy(css="li[class='subnav_item 14141']")
	WebElement woodensofa;
	@FindBy(css="div[data-group='sorting']")
	WebElement sorting;
	@FindBy(xpath="//li[@data-key='price_asc']")
	WebElement lowtohigh;
	@FindBy(css="div[class='results-count']")
	WebElement count;
	@FindBy(xpath="//li[@data-sku='FNSF51RYRU3']")
	WebElement product;
	@FindBy(css="h1[class='page-heading product-title no-margin']")
	WebElement name;
	@FindBy(css="div[class='price final']")
	WebElement price;
	
	
	 public TC008_PO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement sale() {
			 return sale;
		 }
		
		public WebElement woodensofa(){
			return woodensofa;
		}
		
		public WebElement sorting(){
			return sorting;
		}
		
		public WebElement lowtohigh(){
			return lowtohigh;
		}
		
		public WebElement count(){
			return count;
		}
		
		public WebElement product(){
			return product;
		}
		
		public WebElement name(){
			return name;
		}
		
		public WebElement price(){
			return price;
		}
}
