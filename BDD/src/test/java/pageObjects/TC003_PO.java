package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC003_PO {
public WebDriver driver;
	
	@FindBy(css="li[class='topnav_item diningunit']")
	WebElement dining;
	@FindBy(xpath="//li[@class='subnav_item 14976']")
	WebElement glassware;
	@FindBy(css="a[data-id='122547']")
	WebElement product1;
	@FindBy(css="button[data-event='add_to_cart']")
	WebElement addToCart;
	@FindBy(css="a[class='continueshop']")
	WebElement continueShopping;
	@FindBy(css="a[data-id='122554']")
	WebElement product2;
	@FindBy(css="button[data-sku='DNGLSG71ML10140']")
	WebElement add;
	
	 public TC003_PO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement dining() {
			 return dining;
		 }
		
		public WebElement glassware(){
			return glassware;
		}
		
		public WebElement product1(){
			return product1;
		}
		
		public WebElement addToCart(){
			return addToCart;
		}
		
		public WebElement continueShopping(){
			return continueShopping;
		}
		
		public WebElement product2(){
			return product2;
		}
		
		public WebElement add(){
			return add;
		}
		
	

}
