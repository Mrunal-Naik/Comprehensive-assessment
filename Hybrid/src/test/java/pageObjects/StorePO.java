package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePO {
public WebDriver driver;
	
	@FindBy(className="featuredLinksBar__link")
	WebElement Stores;
	@FindBy(xpath="//a[@href='/furniture-stores/mumbai/bandra?src=stores_listing']")
	WebElement mumbai;
	@FindBy(css="h3[class='no-padding text-left address-name']")
	WebElement title;
	@FindBy(xpath="//address[@class='detail']")
	WebElement address;
	@FindBy(css="a[data-gaaction='click_email']")
	WebElement email;
	
	
	 public StorePO(WebDriver driver) {
			this.driver = driver ;
			PageFactory.initElements(driver,this);
		}

		public WebElement Stores() {
			 return Stores;
		 }
		
		public WebElement mumbai(){
			return mumbai;
		}
		
		public WebElement title(){
			return title;
		}
		
		public WebElement address(){
			return address;
		}
		
		public WebElement email(){
			return email;
		}
		
}
