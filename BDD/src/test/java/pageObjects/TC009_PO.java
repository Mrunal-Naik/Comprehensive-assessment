package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC009_PO {
public WebDriver driver;
	
	@FindBy(css="a[href='https://www.urbanladder.com/furniture?src=explore_categories']")
	WebElement allfurniture;
	@FindBy(css="img[title='Decor Furniture']")
	WebElement Decor;
	@FindBy(css= "img[title='Lighting Furniture']")
	WebElement Lighting;
	@FindBy(css="img[title='Ceiling Lights Furniture']")
	WebElement CeilingLights;
	@FindBy(css="li[data-group='price']")
	WebElement price;
	@FindBy(css="input[id='price_limit_20431-25199']")
	WebElement limit;
	@FindBy(css="div[class='results-count']")
	WebElement number;
	
	 public TC009_PO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement allfurniture() {
			 return allfurniture;
		 }
		
		public WebElement Decor(){
			return Decor;
		}
		
		public WebElement Lighting(){
			return Lighting;
		}
		
		public WebElement CeilingLights(){
			return CeilingLights;
		}
		
		public WebElement price(){
			return price;
		}
		
		public WebElement limit(){
			return limit;
		}
		
		public WebElement number(){
			return number;
		}
		
		
}
