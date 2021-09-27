package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC004_PO {
public WebDriver driver;
	
	@FindBy(id="search")
	WebElement searchbar;
	@FindBy(id="search_button")
	WebElement searchbutton;
	@FindBy(css= "div[data-group='sorting']")
	WebElement sorting;
	@FindBy(xpath="//li[@data-key='price_desc']")
	WebElement hightolow;
	@FindBy(css="a[data-galabel='Fujiwara Bookshelf/Display Cabinet _FNSGDR11TK30101']")
	WebElement product1;
	@FindBy(css="a[data-id='107981']")
	WebElement hover;
	@FindBy(css="a[data-galabel='Malabar Bookshelf/Display Cabinet _FNSGBR12MH10064']")
	WebElement product2;
	@FindBy(id="compare-cta")
	WebElement compare;
	@FindBy(css="div[class='prod-option-type']")
	List<WebElement> name;
	
	 public TC004_PO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement searchbar() {
			 return searchbar;
		 }
		
		public WebElement searchbutton(){
			return searchbutton;
		}
		
		public WebElement sorting(){
			return sorting;
		}
		
		public WebElement hightolow(){
			return hightolow;
		}
		
		public WebElement product1(){
			return product1;
		}
		
		public WebElement hover(){
			return hover;
		}
		
		public WebElement product2(){
			return product2;
		}
		
		public WebElement compare(){
			return compare;
		}
		
		public List<WebElement> name(){
			return name;
		}
}
